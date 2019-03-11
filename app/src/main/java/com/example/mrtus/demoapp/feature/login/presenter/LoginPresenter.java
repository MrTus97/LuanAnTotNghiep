package com.example.mrtus.demoapp.feature.login.presenter;

import com.example.mrtus.demoapp.feature.login.model.LoginModel;
import com.example.mrtus.demoapp.feature.login.view.ILoginFragment;

public class LoginPresenter implements ILoginPresenter {
    private ILoginFragment iLoginFragment;
    public LoginPresenter(ILoginFragment iLoginFragment){
        this.iLoginFragment = iLoginFragment;
    }


    @Override
    public void login(String phone, String password) {
        if (phone.equals("1") && password.equals("1")){
            iLoginFragment.loginSuccess(new LoginModel());
        }else{
            iLoginFragment.loginFailure("Failure");
        }
    }
}
