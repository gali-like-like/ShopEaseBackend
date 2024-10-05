package tech.shop.ease.mbg.model.enums;

public enum HandlerStatus {
    Await("待处理"),Agree("同意上架"),Reject("拒绝上架");
    private String desc;
    private HandlerStatus(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }
}
