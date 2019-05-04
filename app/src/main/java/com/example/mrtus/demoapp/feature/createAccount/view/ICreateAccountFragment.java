package com.example.mrtus.demoapp.feature.createAccount.view;

public interface ICreateAccountFragment {

    void createAccountSuccess(String message);
    void createAccountFailure(String message);
    void anotherReason(String message);

    void verifyAccountSuccess(String message);
    void verifyAccountFailure(String message);
}
