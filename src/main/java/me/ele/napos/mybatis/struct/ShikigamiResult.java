package me.ele.napos.mybatis.struct;

/**
 * Created by jakoo on 2017/1/16.
 */
public class ShikigamiResult {
    private int status;
    private Shikigami shikigami;
    private String message;

    public ShikigamiResult(StatusType status) {
        this.status = status.getCode();
    }

    public ShikigamiResult(StatusType status, String message) {
        this.status = status.getCode();
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Shikigami getShikigami() {
        return shikigami;
    }

    public void setShikigami(Shikigami shikigami) {
        this.shikigami = shikigami;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
