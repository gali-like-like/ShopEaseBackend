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
@TableName(value = "manage_handler_goods")
public class HandlerGoods implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    @NotNull(message = "拒绝原因不能为空")
    private String rejectReason;

    private HandlerStatus status;//处理的状态

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;//创建时间

    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;//更新的日期时间

    private Integer operateId;//处理人id

    private Integer goodsId;//商品id;
}
