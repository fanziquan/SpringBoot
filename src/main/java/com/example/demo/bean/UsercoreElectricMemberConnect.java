package com.example.demo.bean;

import java.util.Date;

public class UsercoreElectricMemberConnect extends UsercoreElectricMemberConnectKey {
    private String electricUserNo;

    private String electricUserName;

    private Date registDate;

    public String getElectricUserNo() {
        return electricUserNo;
    }

    public void setElectricUserNo(String electricUserNo) {
        this.electricUserNo = electricUserNo;
    }

    public String getElectricUserName() {
        return electricUserName;
    }

    public void setElectricUserName(String electricUserName) {
        this.electricUserName = electricUserName;
    }

    public Date getRegistDate() {
        return registDate;
    }

    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }
}