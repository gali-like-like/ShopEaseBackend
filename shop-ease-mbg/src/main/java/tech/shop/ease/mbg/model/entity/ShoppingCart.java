package tech.shop.ease.mbg.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "user_shopping_cart")
public class ShoppingCart {

    @TableId(type = IdType.AUTO)
    private Integer  id;

    @NotNull(message = "用户id不能为空")
    private Integer userId;

    @NotNull(message = "商品id不能为空")
    private  Integer goodsId;

    @NotNull(message = "商品数量不能为空")
    private Integer quantity;//商品数量

    private Integer voucherId;//优惠券id

    private Integer voucherCount;//优惠券数量

    private Integer actualPrice;//没优惠的总价格

    private Integer preferPrice;//优惠后的总价格

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;
}
