package com.example.mvvm_demo;

import androidx.databinding.BaseObservable;

public class User extends BaseObservable {
    private String account;
    private String pwd;


    public User(String account,String pwd){
        this.account = account;
        this.pwd = pwd;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
        notifyChange();//通知改变 所有参数改变
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
        notifyChange();//通知改变 所有参数改变
    }
}
