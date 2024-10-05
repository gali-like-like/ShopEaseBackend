package tech.shop.ease.mbg.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.shop.ease.mbg.model.enums.CommonStatus;
import tech.shop.ease.mbg.model.enums.StoreStatus;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "business_store")
public class Store implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    @NotNull(message = "店铺名字不能为空")
    private String name;

    @NotNull(message = "店铺营业状态不能为空")
    private StoreStatus businessStatus;

    @NotNull(message = "负责人不能为空")
    private String masterId;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;//店铺上架日期

    @NotNull(message = "描述不能为空")
    private String description;//店铺经营业务的描述

    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;//修改日期

    @NotNull(message = "店铺头像不能为空")
    private String image;

    @NotNull(message = "店铺状态不能为空")
    private CommonStatus status;
}

