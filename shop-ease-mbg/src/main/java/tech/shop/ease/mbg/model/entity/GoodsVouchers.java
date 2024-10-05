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
@TableName(value = "business_goods_vouchers")
public class GoodsVouchers implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer id;

    @NotNull(message = "商品id不能为空")
    private Integer goodsId;

    @NotNull(message = "优惠券id不能为空")
    private Integer vouchersId;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;//创建日期时间

    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;//更新的日期时间

    @NotNull(message = "操作人id不能为空")
    private Integer operateId;//操作人id
}
