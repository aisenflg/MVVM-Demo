package com.example.mvvm_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mvvm_demo.databinding.ActivityMainBinding;
import com.example.mvvm_demo.viewmodels.MainViewModel;
import com.google.android.material.textfield.TextInputEditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    MainViewModel mMainViewModel;
    private TextInputEditText etAccount, etPwd;
    private TextView tvAccount, tvPwd;
    private User mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ViewModel数据绑定
        /*mMainViewModel = new ViewModelProvider(this
                , new ViewModelProvider.NewInstanceFactory()).get(MainViewModel.class);

        etAccount = findViewById(R.id.et_account);
        etPwd = findViewById(R.id.et_pwd);
        tvAccount = findViewById(R.id.tv_account);
        tvPwd = findViewById(R.id.tv_pwd);
        findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMainViewModel.account = etAccount.getText().toString().trim();
                mMainViewModel.pwd = etPwd.getText().toString().trim();
                mMainViewModel.mAccount.setValue(etAccount.getText().toString().trim());
                mMainViewModel.mPwd.setValue(etPwd.getText().toString().trim());

                if (mMainViewModel.account.isEmpty()) {
                    Toast.makeText(MainActivity.this, "请输入账号", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (mMainViewModel.pwd.isEmpty()) {
                    Toast.makeText(MainActivity.this, "请输入密码", Toast.LENGTH_SHORT).show();
                    return;
                }
                //当账号密码发生变动时,通知改动
                mMainViewModel.mAccount.observe(MainActivity.this, s -> tvAccount.setText("账号: " + s));
                mMainViewModel.mPwd.observe(MainActivity.this, s -> tvPwd.setText("密码:" + s));
                Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
            }
        });*/

        //dataBind数据绑定
        ActivityMainBinding dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //设置数据  直接显示在XML上
        mUser = new User("admin", "123456");
        dataBinding.setUser(mUser);

        dataBinding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mUser.setAccount(dataBinding.etAccount.getText().toString().trim());
                mUser.setPwd(dataBinding.etPwd.getText().toString().trim());
            }
        });

    }
}