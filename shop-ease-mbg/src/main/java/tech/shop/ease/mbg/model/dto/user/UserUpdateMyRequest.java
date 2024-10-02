package tech.shop.ease.mbg.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * feat: 用户更新个人信息请求
 *
 * @author jony
 */
@Data
public class UserUpdateMyRequest implements Serializable {

    private static final long serialVersionUID = 1L;
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
}
