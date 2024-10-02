package tech.shop.ease.common.conveying;

/**
 * feat: 自定义错误码
 *
 * @author jony
 */
public enum ErrorCode {

    PARAMS_ERROR(400, "请求参数错误"), NOT_LOGIN_ERROR(401, "未登录"), NO_AUTH_ERROR(402, "无权限"), FORBIDDEN_ERROR(403, "禁止访问"), NOT_FOUND_ERROR(404, "请求数据不存在"), FILE_TYPE_ERROR(405, "文件类型错误"), SYSTEM_ERROR(500, "系统内部异常"), OPERATION_ERROR(501, "操作失败");

    /**
     * feat: 状态码
     */
    private final int code;

    /**
     * feat: 信息
     */
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
