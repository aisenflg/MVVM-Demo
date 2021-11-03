package com.example.mvvm_demo.viewmodels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    public String account;
    public String pwd;
    public MutableLiveData<String> mAccount = new MutableLiveData<>();
    public MutableLiveData<String> mPwd = new MutableLiveData<>();

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setAccount(MutableLiveData<String> account) {
        mAccount = account;
    }

    public void setPwd(MutableLiveData<String> pwd) {
        mPwd = pwd;
    }
}
