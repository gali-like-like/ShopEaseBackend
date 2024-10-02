package tech.shop.ease.mbg.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * feat: 用户创建请求
 *
 * @author jony
 */
@Data
public class UserAddRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * feat: 用户昵称
     */
    private String userName;
    /**
     * feat: 账号
     */
    private String userAccount;
    /**
     * feat: 用户头像
     */
    private String userAvatar;
    /**
     * feat: 用户角色: user, admin
     */
    private String userRole;
}
