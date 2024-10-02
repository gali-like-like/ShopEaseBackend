package tech.shop.ease.mbg.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * feat: 用户更新请求（管理员操作）
 *
 * @author jony
 */
@Data
public class UserUpdateRequest implements Serializable {
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
     * feat: 简介
     */
    private String userProfile;
    /**
     * feat: 用户角色：user/admin/ban
     */
    private String userRole;
}
