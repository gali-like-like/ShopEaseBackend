package tech.shop.ease.mbg.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.shop.ease.mbg.model.enums.OrderStatus;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "manage_order")
public class Order implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    @NotNull
    private Integer userId;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime orderTime;//下单时间

    private LocalDateTime payTime;//支付时间

    private OrderStatus status;//订单状态

    @NotNull(message = "收货地址不能为空")
    private Integer addressId;//收货地址编号

    private LocalDateTime deadline;//截至日期

    @NotNull(message = "订单号")
    private Integer orderId;//订单号
}
