package com.example.mrtus.demoapp.feature.login.view;

import com.example.mrtus.demoapp.feature.login.model.LoginModel;

public interface ILoginFragment {
    public void loginSuccess(LoginModel loginModel);
    public void loginFailure(String message);
    public void anotherReason(String message);
}
