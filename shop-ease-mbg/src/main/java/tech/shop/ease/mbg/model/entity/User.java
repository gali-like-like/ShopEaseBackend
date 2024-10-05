package tech.shop.ease.mbg.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * feat: 用户
 *
 * @author jony
 */
@TableName(value = "user_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type=IdType.ASSIGN_UUID)
    private Integer id;

    private String name;//用户昵称

    private String username;//用户密码

    @TableField(fill = FieldFill.INSERT)
    private String password;

    private String header;//用户头像

    @TableField(value = "is_exists")
    @TableLogic
    private Boolean isExists;

    private String phone;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField(value = "delete_time", fill = FieldFill.UPDATE)
    private LocalDateTime deleteTime;

    @TableField
    private Integer inviterId;//邀请人id

    @TableField(fill = FieldFill.INSERT)
    private Integer points;//积分
}
