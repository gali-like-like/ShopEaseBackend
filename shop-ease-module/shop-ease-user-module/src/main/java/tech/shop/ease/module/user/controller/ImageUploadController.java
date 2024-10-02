package tech.shop.ease.module.user.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.Region;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import tech.shop.ease.common.conveying.BaseResponse;
import tech.shop.ease.common.conveying.ErrorCode;
import tech.shop.ease.common.conveying.ResultUtil;
import tech.shop.ease.common.exception.BusinessException;
import tech.shop.ease.common.utils.PathUtil;

import java.io.InputStream;

@RestController
@ConfigurationProperties(prefix = "qiniu")
@Data
public class ImageUploadController {

    // 声明oss访问参数
    private String accessKey;
    private String secretKey;
    private String bucket;
    private String domain;


    /**
     * feat: 图片上传接口
     *
     * @param img
     * @return BaseResponse
     */
    @PostMapping("/upload")
    public BaseResponse<String> uploadImg(@RequestParam("file") MultipartFile img) {
        // 1.判断文件类型
        // 获取原始文件名
        String originalFilename = img.getOriginalFilename();
        // 对原始文件名进行判断(非 .jpg;.jpeg;.png;.bmp;.gif;.webp;.ico 抛出异常)
        if (originalFilename != null && !originalFilename.endsWith(".png") && !originalFilename.endsWith(".jpg") && !originalFilename.endsWith(".jpeg") && !originalFilename.endsWith(".bmp") && !originalFilename.endsWith(".gif") && !originalFilename.endsWith(".webp") && !originalFilename.endsWith(".ico")) {
            throw new BusinessException(ErrorCode.FILE_TYPE_ERROR);
        }
        // 2.如果判断通过上传文件到OSS
        String filePath = null;
        if (originalFilename != null) {
            filePath = PathUtil.generateFilePath(originalFilename);
        }
        String url = uploadOss(img, filePath);//  2099/2/3/wqeqeqe.png
        // 3.图片链接持久化，存入MySQL
        return ResultUtil.success(url);
    }


    /**
     * feat: qiniu 文件上传sdk
     *
     * @param imgFile
     * @param filePath
     * @return String
     */
    private String uploadOss(MultipartFile imgFile, String filePath) {
        // 构造一个带指定 Region 对象的配置类
        Configuration cfg = new Configuration(Region.autoRegion());
        //...其他参数参考类注释
        UploadManager uploadManager = new UploadManager(cfg);
        // 默认不指定key的情况下，以文件内容的hash值作为文件名
        String key = filePath;
        try {
            InputStream inputStream = imgFile.getInputStream();
            Auth auth = Auth.create(accessKey, secretKey);
            String upToken = auth.uploadToken(bucket);
            try {
                Response response = uploadManager.put(inputStream, key, upToken, null, null);
                // 解析上传成功的结果
                DefaultPutRet putRet = new ObjectMapper().readValue(response.bodyString(), DefaultPutRet.class);
                // System.out.println(putRet.key);
                // System.out.println(putRet.hash);
                return domain + key;
            } catch (QiniuException ex) {
                Response r = ex.response;
                System.err.println(r.toString());
                try {
                    System.err.println(r.bodyString());
                } catch (QiniuException ex2) {
                    // ignore
                }
            }
        } catch (Exception ex) {
            // ignore
        }
        return "An exception has occurred";
    }
}
