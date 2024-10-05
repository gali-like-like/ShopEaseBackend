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
@TableName(value = "manage_store_audits")
public class StoreAudits implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    @NotNull(message = "店铺id不能为空")
    private Integer storeId;

    @NotNull(message = "店铺申请原因不能为空")
    private String applicationReason;

    @NotNull(message = "店铺申请日期时间不能为空")
    private LocalDateTime applicationTime;

    @NotNull(message = "申请人不能为空")
    private Integer applicationOperator;
}
