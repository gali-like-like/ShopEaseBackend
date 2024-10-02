package tech.shop.ease.common.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * feat: SQL 工具
 *
 * @author jony
 */
public class SqlUtil {

    /**
     * feat: 校验排序字段是否合法（防止 SQL 注入）
     *
     * @param sortField
     * @return
     */
    public static boolean validSortField(String sortField) {
        if (StringUtils.isBlank(sortField)) {
            return false;
        }
        return !StringUtils.containsAny(sortField, "=", "(", ")", " ");
    }
}
