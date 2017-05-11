package me.ele.napos.mybatis.struct;

/**
 * Created by jakoo on 2016/11/25.
 */
public enum StatusType {
    SUCCESS(200),
    EXCEPTION(500);

    private int code;

    StatusType(int code) {
        this.code = code;
    }

    public int getCode(){
        return code;
    }
}
