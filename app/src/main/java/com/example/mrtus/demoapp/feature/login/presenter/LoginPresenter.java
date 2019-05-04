package com.example.mrtus.demoapp.feature.login.presenter;

import android.util.Log;

import com.example.mrtus.demoapp.common.Common;
import com.example.mrtus.demoapp.feature.login.model.ResponseLogin;
import com.example.mrtus.demoapp.feature.login.view.ILoginFragment;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginPresenter implements ILoginPresenter {
    private static final String TAG = LoginPresenter.class.getSimpleName();
    private ILoginFragment iLoginFragment;
    public LoginPresenter(ILoginFragment iLoginFragment){
        this.iLoginFragment = iLoginFragment;
    }


    @Override
    public void login(String phone, String password) {
        Call<ResponseLogin> call = Common.apiInterface.login(phone, password);

        call.enqueue(new Callback<ResponseLogin>() {
            @Override
            public void onResponse(Call<ResponseLogin> call, Response<ResponseLogin> response) {
                if (response.code() == Common.RESPONSE_SUCCESS){
                    if (response.body().getData() != null){
                        Log.d(TAG + ": token =",response.body().getData().getToken());
                        iLoginFragment.loginSuccess(response.body().getData());
                    }else{
                        Log.d(TAG + ": data null, message =",response.body().getMessage());
                        iLoginFragment.loginFailure(response.body().getMessage());
                    }
                }else{
                    Log.d(TAG + ": result code =", String.valueOf(response.code()));
                    iLoginFragment.loginFailure(Common.STR_BAD_REQUEST);
                }
            }

            @Override
            public void onFailure(Call<ResponseLogin> call, Throwable t) {
                Log.d(TAG,t.getMessage());
                iLoginFragment.anotherReason(t.getMessage());
            }
        });
    }
}
