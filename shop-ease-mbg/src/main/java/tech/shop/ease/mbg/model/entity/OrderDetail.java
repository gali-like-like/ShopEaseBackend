package tech.shop.ease.mbg.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "user_order_detail")
public class OrderDetail implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Integer id;

    @NotNull(message = "商品id")
    private Integer goodsId;

    private Integer quantity;//商品数量

    @NotNull(message = "订单号不能为空")
    private Integer orderId;//订单号

    private Integer voucherId;//优惠劵id

    private Integer voucherCount;//使用多少张优惠劵
}
