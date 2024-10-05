package tech.shop.ease.mbg.model.enums;

import com.mysql.cj.x.protobuf.MysqlxCursor;

public enum StoreStatus {
    CurrentOpen("营业中"),CurrentClose("打烊中");
    private String desc;
    private StoreStatus(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }
}
