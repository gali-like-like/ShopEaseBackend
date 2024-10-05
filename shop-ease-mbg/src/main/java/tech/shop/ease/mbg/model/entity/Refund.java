package tech.shop.ease.mbg.model.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "manage_refund")
public class Refund implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    @NotNull(message = "用户id")
    private Integer userId;

    @NotNull(message = "订单号")
    private Integer orderId;

    @NotNull(message = "退款原因")
    private String reason;

    private LocalDateTime refundTime;//申请退款日期
}
