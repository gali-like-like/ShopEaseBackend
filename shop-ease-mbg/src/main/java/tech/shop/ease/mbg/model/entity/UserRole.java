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
@TableName("manage_user_role")
public class UserRole implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    @NotNull(message = "用户id不能为空")
    private String userId;

    @NotNull(message = "角色id不能为空")
    private String roleId;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;//创建的日期

    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;//更新的日期
}
