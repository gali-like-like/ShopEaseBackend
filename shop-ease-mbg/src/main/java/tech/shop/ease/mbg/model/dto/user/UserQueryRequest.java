package tech.shop.ease.mbg.model.dto.user;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tech.shop.ease.common.conveying.PageRequest;

import java.io.Serializable;

/**
 * feat: 用户查询请求
 *
 * @author jony
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserQueryRequest extends PageRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * feat: id
     */
    private Long id;
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
     * feat: 简介
     */
    private String userProfile;
    /**
     * feat: 用户角色：user/admin/ban
     */
    private String userRole;
}
