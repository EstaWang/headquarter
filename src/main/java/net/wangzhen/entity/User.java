package net.wangzhen.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by estaw on 2017/10/11.
 * email: zhen.wang@dianrong.com
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String username;
    private String password;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime jointime;
    private Boolean adminlabel;

    public User() {
        super();
    }

    public User(String username, String password, Boolean adminlabel) {
        this.username = username;
        this.password = password;
        this.adminlabel = adminlabel;
    }

    public User(String username, String password, LocalDateTime jointime, Boolean adminlabel) {
        this.username = username;
        this.password = password;
        this.jointime = jointime;
        this.adminlabel = adminlabel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDateTime getJointime() {
        return jointime;
    }

    public void setJointime(LocalDateTime jointime) {
        this.jointime = jointime;
    }

    public Boolean getAdminlabel() {
        return adminlabel;
    }

    public void setAdminlabel(Boolean adminlabel) {
        this.adminlabel = adminlabel;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", jointime=" + jointime +
                ", adminlabel=" + adminlabel +
                '}';
    }
}
