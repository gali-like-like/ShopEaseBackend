package tech.shop.ease.mbg.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@TableName("manage_todos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Todos implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Integer id;

    @NotNull(message = "用户id不能为空")
    private Integer userId;

    @NotNull(message = "任务名称不能为空")
    private String taskName;

    private String taskDescription;//任务描述

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;//任务创建日期

    private Byte status;//任务状态

    private LocalDateTime completedTime;//任务完成日期
}
