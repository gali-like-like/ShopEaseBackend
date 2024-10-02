package tech.shop.ease.common.conveying;

import lombok.Data;
import tech.shop.ease.common.constant.CommonConstant;

/**
 * feat: 分页请求
 *
 * @author jony
 */
@Data
public class PageRequest {

    /**
     * feat: 当前页号
     */
    private long current = 1;

    /**
     * feat: 页面大小
     */
    private long pageSize = 10;

    /**
     * feat: 排序字段
     */
    private String sortField;

    /**
     * feat: 排序顺序（默认升序）
     */
    private String sortOrder = CommonConstant.SORT_ORDER_ASC;
}
