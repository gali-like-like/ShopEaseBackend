package tech.shop.ease.mbg.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.shop.ease.mbg.model.enums.CommonStatus;
import tech.shop.ease.mbg.model.enums.GoodsType;
import tech.shop.ease.mbg.model.enums.SupportRefund;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "business_goods")
public class Goods implements Serializable {
    private static final long serializable = 1L;

    @TableId(type = IdType.AUTO)
    private Integer id;

    private GoodsType goodsType;//实体商品还是虚拟商品

    private CommonStatus status;//上架还是下架

    @NotNull(message = "商品价格不能为空")
    private BigDecimal price;//商品价格

    @NotNull(message = "商品颜色不能为空")
    private String color;//商品颜色

    @NotNull(message = "商品大小不能为空")
    private String size;//商品大小

    @NotNull(message = "商品图片不能为空")
    private String image;

    @NotNull(message = "商品类型不能为空")
    private Integer category;

    @NotNull(message = "店铺不能为空")
    private Integer storeId;

    @NotNull(message = "商品名字不能为空")
    private String name;

    @NotNull(message = "商品描述不能为空")
    private String description;

    @NotNull(message = "积分价值不能为空")
    private Integer pointsRedemption;

    @NotNull(message = "商品库存数量不能为空")
    private Integer count;

    private SupportRefund supportRefund;//是否支持退款
}
