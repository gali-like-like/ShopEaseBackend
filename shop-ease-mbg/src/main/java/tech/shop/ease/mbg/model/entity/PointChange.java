package tech.shop.ease.mbg.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@TableName(value = "manage_points_change")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PointChange implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Integer id;

    @NotNull(message = "用户id不能为空")
    private Integer userId;

    private BigDecimal money;

    private Integer changMoney;

    @NotNull(message = "资金变化原因不能为空")
    private String reason;

    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;
}
