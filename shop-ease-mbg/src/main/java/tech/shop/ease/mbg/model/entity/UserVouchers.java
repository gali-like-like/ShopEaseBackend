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
@TableName(value = "business_user_vouchers")
public class UserVouchers implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    @NotNull(message = "用户id不能为空")
    private Integer userId;

    @NotNull(message = "用户拥有的优惠券数量不能为空")
    private Integer count;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;//创建的日期

    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;//更新的日期

    @NotNull(message = "可用的优惠券数量不能为空")
    private Integer activeCount;
}
