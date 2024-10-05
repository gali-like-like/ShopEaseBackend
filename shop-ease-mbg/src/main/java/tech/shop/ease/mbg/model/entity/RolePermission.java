package tech.shop.ease.mbg.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "manage_role_permission")
public class RolePermission implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    @NotNull(message = "角色id不能为空")
    private Integer roleId;

    @NotNull(message = "权限id不能为空")
    private Integer permissId;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;//创建的日期

    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;//更新的日期
}
