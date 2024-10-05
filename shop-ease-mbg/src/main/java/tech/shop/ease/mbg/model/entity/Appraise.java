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
@TableName(value="user_appraise")
public class Appraise implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Integer id;

    @NotNull(message = "用户id不能为空")
    private Integer userId;

    @NotNull(message = "商品id不能为空")
    private Integer goodsId;

    private String mainComment;

    private Byte level;//评价级别

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    private String image1;

    private String image2;

    private String image3;
}
