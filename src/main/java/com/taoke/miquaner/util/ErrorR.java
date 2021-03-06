package com.taoke.miquaner.util;

public class ErrorR {

    public static final String CAN_NOT_SAVE_OBJECT_MSG = "无法保存数据到数据库";
    public static final String NO_ID_FOUND_MSG = "没有找到主键，错误可能发生在前端漏传主键字段";
    public static final String NOT_FOR_BUYER_MSG = "购买者不享有此功能";
    public static final String DOWNLOAD_ERROR_MSG = "下载文件错误";
    public static final String NO_USER_FOUND_MSG = "没有该用户";
    public static final String EXCEPTION_FOUND_MSG = "发生异常：";

    static final String SQL_ERROR = "SQL_ERROR";

    public static final String CAN_NOT_SAVE_OBJECT = "CAN_NOT_SAVE_OBJECT";
    public static final String NO_ID_FOUND = "NO_ID_FOUND";
    public static final String NOT_FOR_BUYER = "NOT_FOR_BUYER";
    public static final String DOWNLOAD_ERROR = "DOWNLOAD_ERROR";
    public static final String ST_NOT_MATCH = "ST_NOT_MATCH";
    public static final String NO_SUPER_ROLE = "NO_SUPER_ROLE";
    public static final String ALREADY_HAS_SUPER_USER = "ALREADY_HAS_SUPER_USER";
    public static final String SUBMIT_NEED_ROLE = "SUBMIT_NEED_ROLE";
    public static final String SUBMIT_NEED_NAME = "SUBMIT_NEED_NAME";
    public static final String ADMIN_NOT_FOUND = "ADMIN_NOT_FOUND";
    public static final String ADMIN_WRONG_PWD = "ADMIN_WRONG_PWD";
    public static final String ADMIN_NOT_PERMITTED = "ADMIN_NOT_PERMITTED";
    public static final String FAIL_ON_EXTRACT_OBJECT_CONFIG = "FAIL_ON_EXTRACT_OBJECT_CONFIG";
    public static final String FAIL_ON_ALI_API = "FAIL_ON_ALI_API";
    public static final String NO_USER_FOUND = "NO_USER_FOUND";
    public static final String USER_WRONG_PWD = "USER_WRONG_PWD";
    public static final String ALREADY_REGISTERED_USER = "ALREADY_REGISTERED_USER";
    public static final String NO_TITLE_FOUND = "NO_TITLE_FOUND";
    public static final String NO_COL_HANDLER_FOUND = "NO_COL_HANDLER_FOUND";
    public static final String WRONG_SEARCH_TYPE = "WRONG_SEARCH_TYPE";
    public static final String NO_CORRECT_PHONE = "NO_CORRECT_PHONE";
    public static final String NO_VERIFY_CODE = "NO_VERIFY_CODE";
    public static final String VERIFY_CODE_EXPIRED = "VERIFY_CODE_EXPIRED";
    public static final String WRONG_VERIFY_CODE = "WRONG_VERIFY_CODE";
    public static final String AT_LEAST_TEN = "AT_LEAST_TEN";
    public static final String NO_THAT_MUCH = "NO_THAT_MUCH";
    public static final String WRONG_MESSAGE_ID = "WRONG_MESSAGE_ID";
    public static final String NEED_NAME_UNIQUE = "NEED_NAME_UNIQUE";
    public static final String NO_INV_CODE_FOUND = "NO_INV_CODE_FOUND";
    public static final String THIRD_CAN_NOT_ENROLL = "THIRD_CAN_NOT_ENROLL";
    public static final String FAIL_ON_JD_API = "FAIL_ON_JD_API";
    public static final String FAIL_ON_OBJECT_MAPPER_API = "FAIL_ON_OBJECT_MAPPER_API";
    public static final String FAIL_ON_SERV_RET_NON_RESULT = "FAIL_ON_SERV_RET_NON_RESULT";
    public static final String NO_INFO_FOUND = "NO_INFO_FOUND";

    private String key;
    private String msg;

    public ErrorR(String key, String msg) {
        this.key = key;
        this.msg = msg;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ErrorR{" +
                "key='" + key + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
