package tech.shop.ease.mbg.model.enums;

import co.elastic.clients.elasticsearch._types.analysis.IcuFoldingTokenFilter;
import org.jetbrains.annotations.NotNull;

public enum PayMethod {
    WeChat("微信"),Alipay("支付宝"),Bank("银行");
    private String desc;
    private PayMethod(String payMethod) {
        this.desc = payMethod;
    }

    public String getDesc() {
        return desc;
    }

    public int indexOf(@NotNull PayMethod payMethod) {
        int payIndex = 0;
        switch (payMethod) {
            case WeChat:
                payIndex = 0;
                break;
            case Alipay:
                payIndex = 1;
                break;
            case Bank:
                payIndex = 2;
                break;
        }
        return payIndex;
    }

    public static PayMethod getPayMethod(int payMethod) {
        if (payMethod == WeChat.ordinal()) {
            return WeChat;
        }
        else if (payMethod == Alipay.ordinal()) {
            return Alipay;
        }
        else if (payMethod == Bank.ordinal()) {
            return Bank;
        }
        return null;
    }

    public static PayMethod getPayMethod(String payMethod) {
        if (payMethod == null) {
            return null;
        }
        else if (payMethod.equals(WeChat.getDesc())) {
            return WeChat;
        }
        else if (payMethod.equals(Alipay.getDesc())) {
            return Alipay;
        }
        else if (payMethod.equals(Bank.getDesc())) {
            return Bank;
        }
        return null;
    }
}
