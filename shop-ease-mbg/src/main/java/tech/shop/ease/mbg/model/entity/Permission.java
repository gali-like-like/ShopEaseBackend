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
@TableName(value = "manage_permission")
public class Permission implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    @NotNull(message = "权限名称不能为空")
    private String name;

    @NotNull(message = "权限的具体描述不能为空")
    private String description;

    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime createTime;//创建的日期时间

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime updateTime;//更新的日期时间
}
