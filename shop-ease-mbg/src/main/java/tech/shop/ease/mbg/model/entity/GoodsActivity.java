package tech.shop.ease.mbg.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "business_goods_activity")
public class GoodsActivity implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    @NotNull(message = "商品id不能为空")
    private Integer goodsId;

    @NotNull(message = "限购数量不能为空")
    private Integer count;

    @NotNull(message = "活动id不能为空")
    private Integer activityId;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;//创建时间

    private Byte isStatus;//活动是否过期

    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;//更新的日期时间

    @NotNull(message = "操作人不能为空")
    private Integer operateId;//操作人id;
}
