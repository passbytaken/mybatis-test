package me.ele.napos.mybatis.struct;

/**
 * Created by jakoo on 14/04/2017.
 */
public class KeeperResult {
    private int status;
    private String message;

    public KeeperResult(StatusType status) {
        this.status = status.getCode();
    }

    public KeeperResult(StatusType status, String message) {
        this.status = status.getCode();
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
