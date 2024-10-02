package tech.shop.ease.mbg.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * feat: 用户
 *
 * @author jony
 */
@TableName(value = "user")
@Data
public class User implements Serializable {

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
    /**
     * feat: id
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    /**
     * feat: 用户账号
     */
    private String userAccount;
    /**
     * feat: 用户密码
     */
    private String userPassword;
    /**
     * feat: 开放平台id
     */
    private String unionId;
    /**
     * feat: 公众号openId
     */
    private String mpOpenId;
    /**
     * feat: 用户昵称
     */
    private String userName;
    /**
     * feat: 用户头像
     */
    private String userAvatar;
    /**
     * feat: 用户简介
     */
    private String userProfile;
    /**
     * feat: 用户角色：user/admin/ban
     */
    private String userRole;
    /**
     * feat: 创建时间
     */
    private Date createTime;
    /**
     * feat: 更新时间
     */
    private Date updateTime;
    /**
     * feat: 是否删除
     */
    @TableLogic
    private Integer isDelete;
}
