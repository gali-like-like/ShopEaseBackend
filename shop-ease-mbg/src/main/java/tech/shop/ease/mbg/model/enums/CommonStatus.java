package tech.shop.ease.mbg.model.enums;

public enum CommonStatus {
    Upload("上架"),download("下架");
    private String desc;
    private CommonStatus(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }
}
