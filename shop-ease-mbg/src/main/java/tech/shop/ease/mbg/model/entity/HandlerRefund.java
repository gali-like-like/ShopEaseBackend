package tech.shop.ease.mbg.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "manage_handler_refund")
public class HandlerRefund implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Integer id;

    @NotNull(message = "订单号不能为空")
    private Integer orderId;//订单号

    private Integer businessId;//处理人id

    @NotNull(message = "拒绝原因不能为空")
    private String reason;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;//创建的日期

    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;//更新的日期
}
