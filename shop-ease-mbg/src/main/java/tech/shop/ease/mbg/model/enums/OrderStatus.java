package tech.shop.ease.mbg.model.enums;

public enum OrderStatus {
    NotPay("未支付"),
    AwaitShipment("待发货"),
    Received("已收货"),
    Refunding("退款售后"),
    Completed("已完成");
    private String desc;
    private OrderStatus(String desc){
        this.desc = desc;
    }

    public String getDesc(){
        return desc;
    }

    public OrderStatus getStatus(){
        return OrderStatus.valueOf(desc);
    }
}
