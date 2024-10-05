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
@TableName(value = "business_vouchers")
public class Vouchers implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer id;

    @NotNull(message = "最少消费金额数量不能为空")
    private Integer least_consume;

    @NotNull(message = "减免金额不能为空")
    private Integer relif;

    @NotNull(message = "优惠劵开始日期不能为空")
    private LocalDateTime beginTime;

    @NotNull(message = "优惠券截至日期不能为空")
    private LocalDateTime endTime;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;//创建日期

    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;//更新的日期

    @NotNull(message = "操作人不能为空")
    private Integer operator;

    private Integer mostCount;//每人最多可领取的优惠券数量
}
