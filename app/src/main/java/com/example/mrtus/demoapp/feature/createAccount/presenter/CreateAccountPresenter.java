package com.example.mrtus.demoapp.feature.createAccount.presenter;

import com.example.mrtus.demoapp.common.Common;
import com.example.mrtus.demoapp.feature.createAccount.model.ResponseCreateAccount;
import com.example.mrtus.demoapp.feature.createAccount.view.CreateAccountFragment;
import com.example.mrtus.demoapp.feature.createAccount.view.ICreateAccountFragment;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CreateAccountPresenter implements ICreateAccountPresenter {
    private static final String TAG = CreateAccountPresenter.class.getSimpleName();
    private ICreateAccountFragment iCreateAccountFragment;

    public CreateAccountPresenter(ICreateAccountFragment createAccountFragment) {
        this.iCreateAccountFragment = createAccountFragment;
    }

    @Override
    public void createAccount(String phone, String name, String teamName, String password) {
        Call<ResponseCreateAccount> call = Common.apiInterface.createAccount(phone,name,teamName,password);
        call.enqueue(new Callback<ResponseCreateAccount>() {
            @Override
            public void onResponse(Call<ResponseCreateAccount> call, Response<ResponseCreateAccount> response) {
                if (response.code() == Common.RESPONSE_SUCCESS){
                    if (response.body().getData() != null){
                        iCreateAccountFragment.createAccountSuccess(response.body().getMessage());
                    }else{
                        iCreateAccountFragment.createAccountFailure(response.body().getMessage());
                    }

                }else{
                    iCreateAccountFragment.createAccountFailure(Common.STR_SOMETHING_ERROR);
                }
            }

            @Override
            public void onFailure(Call<ResponseCreateAccount> call, Throwable t) {
                iCreateAccountFragment.anotherReason(t.getMessage());
            }
        });
    }
}
