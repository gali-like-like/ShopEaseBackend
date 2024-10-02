package tech.shop.ease.common.conveying;

import lombok.Data;

import java.io.Serializable;

/**
 * feat: 删除请求
 *
 * @author jony
 */
@Data
public class DeleteRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * feat: id
     */
    private Long id;
}
