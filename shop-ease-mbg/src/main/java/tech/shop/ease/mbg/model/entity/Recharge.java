package tech.shop.ease.mbg.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.signedness.qual.Unsigned;
import tech.shop.ease.mbg.model.enums.PayMethod;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "manage_recharge")
public class Recharge implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Integer id;
    @NotNull(message = "用户id不能为空")
    private Integer userId;

    @NotNull(message = "充值金额不能为空")
    private Integer recharage;

    @NotNull(message = "支付方式不能为空")
    private PayMethod payMethod;

    @NotNull(message = "支付时间不能为空")
    private LocalDateTime payTime;

    @NotNull(message = "截至日期不能为空")
    private LocalDateTime deadline;
}
