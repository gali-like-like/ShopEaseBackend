package tech.shop.ease.mbg.model.enums;

public enum SupportRefund {
    Yes("支持"),No("不支持");
    private String desc;
    private SupportRefund(String desc) {
        this.desc = desc;
    }
}
