package tech.shop.ease.mbg.model.enums;

public enum RefundStatus {
    Pending("待处理"),Agree("同意退款申请"),Reject("拒绝退款申请");
    private String desc;
    private RefundStatus(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }
}
