package tech.shop.ease.mbg.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.shop.ease.mbg.model.enums.DefaultStatus;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "user_address")
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Integer id;

    @NotNull(message = "用户id不能为空")
    private Integer userId;

    @NotNull(message = "省份不能为空")
    private String province;//省份

    @NotNull(message = "城市不能为空")
    private String city;//城市

    @NotNull(message = "地区不能为空")
    private String street;//地区

    @NotNull(message = "详细地址")
    private String detial;

    @NotNull(message = "默认选项必填")
    private DefaultStatus isDefault;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;//创建的日期时间

    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;//更新的日期时间

}
