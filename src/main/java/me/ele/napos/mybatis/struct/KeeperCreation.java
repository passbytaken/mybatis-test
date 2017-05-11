package me.ele.napos.mybatis.struct;

import java.util.Date;

/**
 * Created by jakoo on 14/04/2017.
 */
public class KeeperCreation {

    private int type;
    private int status;
    private String username;
    private String password;
    private String mobile;
    private String mail;
    private String realname;
    private String imageHash;
    private String title;
    private Date createrAt;
    private Date updatedAt;
    private Date lastActedTime;


    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getImageHash() {
        return imageHash;
    }

    public void setImageHash(String imageHash) {
        this.imageHash = imageHash;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreaterAt() {
        return createrAt;
    }

    public void setCreaterAt(Date createrAt) {
        this.createrAt = createrAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getLastActedTime() {
        return lastActedTime;
    }

    public void setLastActedTime(Date lastActedTime) {
        this.lastActedTime = lastActedTime;
    }
}
