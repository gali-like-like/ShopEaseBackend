package tech.shop.ease.mbg.model.dto.file;

import lombok.Data;

import java.io.Serializable;

/**
 * feat: 文件上传请求
 *
 * @author jony
 */
@Data
public class UploadFileRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * feat: 业务
     */
    private String biz;
}
