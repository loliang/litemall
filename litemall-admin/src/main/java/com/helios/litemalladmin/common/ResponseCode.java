package com.helios.litemalladmin.common;

/**
 * @author Leon
 * @date 2019/3/10
 */
public enum ResponseCode {
    // 成功
    SUCCESS(200, "SUCCESS"),
    // 失败
    ERROR(500, "ERROR"),
    // 校验失败
    VALIDATE_FAILED(404, "VALIDATE_FAILED"),
    // 未认证
    UNAUTHORIZED(401, "UNAUTHORIZED"),
    // 未授权
    FORBIDDEN(403, "FORBIDDEN");

    private int code;
    private String desc;

    ResponseCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
