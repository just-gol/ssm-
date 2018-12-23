package com.qsqx.pojo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Long id;

    private String fullname;

    private String usertype;

    private Date addedtime;

    private Integer money;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname == null ? null : fullname.trim();
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype == null ? null : usertype.trim();
    }

    public Date getAddedtime() {
        return addedtime;
    }

    public void setAddedtime(Date addedtime) {
        this.addedtime = addedtime;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", fullname=").append(fullname);
        sb.append(", usertype=").append(usertype);
        sb.append(", addedtime=").append(addedtime);
        sb.append(", money=").append(money);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}