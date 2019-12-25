package com.demo.entity;

import java.util.Date;

public class Sumday {
    private Integer id;

    private Double totalmoney;

    private Date time;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private String totalnum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(Double totalmoney) {
        this.totalmoney = totalmoney;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1;
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2;
    }

    public String getReserve3() {
        return reserve3;
    }

    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3;
    }

    public String getTotalnum() {
        return totalnum;
    }

    public void setTotalnum(String totalnum) {
        this.totalnum = totalnum;
    }
}