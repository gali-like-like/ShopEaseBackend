package tech.shop.ease.mbg.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.shop.ease.mbg.model.enums.HandlerStatus;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "manage_handler_store")
public class HandlerStore implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer id;

    @NotNull(message = "店铺id不能为空")
    private Integer storeId;

    private HandlerStatus status;//处理状态

    private Integer operator;//处理人

    private String rejectReason;//拒绝上架原因

    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;//更新日期

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;//创建日期
}
