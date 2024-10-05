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
@TableName(value = "business_activity")
public class Activity implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    @NotNull(message = "活动名称不能为空")
    private String name;

    @NotNull(message = "活动开始日期不能为空")
    private LocalDateTime beginTime;

    @NotNull(message = "活动结束日期不能为空")
    private LocalDateTime endTime;

    @NotNull(message = "活动描述不能为空")
    private String description;

    @NotNull(message = "操作人不能为空")
    private Integer operator;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;//创建日期

    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;//更新日期
}
