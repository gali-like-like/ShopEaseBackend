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
@TableName(value = "manage_roles")
public class Role implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    @NotNull(message = "角色名字不能为空")
    private String name;

    @NotNull(message = "角色描述不能为空")
    private String description;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;//创建日期

    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;//更新日期
}
