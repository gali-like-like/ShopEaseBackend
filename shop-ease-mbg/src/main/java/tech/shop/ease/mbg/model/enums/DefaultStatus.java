package tech.shop.ease.mbg.model.enums;

public enum DefaultStatus {
    Yes("是"),No("否");
    private String status;
    private DefaultStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
