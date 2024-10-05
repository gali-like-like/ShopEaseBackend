package tech.shop.ease.mbg.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "busines_goods_status")
public class GoodsStatus implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    @NotNull(message = "商品id不能为空")
    private Integer goodsId;

    @NotNull(message = "上架原因不能为空")
    private String reason;

    @NotNull(message = "申请上架日期不能为空")
    private LocalDateTime requestUploadTime;
}
