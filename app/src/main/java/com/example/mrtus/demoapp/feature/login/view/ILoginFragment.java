package com.example.mrtus.demoapp.feature.login.view;

import com.example.mrtus.demoapp.feature.login.model.LoginModel;

public interface ILoginFragment {
    void loginSuccess(LoginModel loginModel);
    void loginFailure(String message);
    void anotherReason(String message);
}
