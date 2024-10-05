package tech.shop.ease.mbg.model.enums;

public enum GoodsType {
    Physical("实体商品"),Virtual("虚拟商品");
    private String desc;
    private GoodsType(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }
}
