package tech.shop.ease.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class PathUtil {
    public static String generateFilePath(String fileName) {
        // 根据日期生成路径   2022/1/15/
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/");
        Date date = new Date();
        String datePath = sdf.format(date);
        // uuid作为文件名
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        // 后缀和文件后缀一致
        int index = fileName.lastIndexOf(".");
        // test.jpg -> .jpg
        String fileType = fileName.substring(index);
        return datePath + uuid + fileType;
    }
}
