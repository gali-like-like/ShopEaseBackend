package tech.shop.ease.mbg.model.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * feat: 用户视图（脱敏）
 *
 * @author jony
 */
@Data
public class UserVO implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * feat: id
     */
    private Long id;
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
}
