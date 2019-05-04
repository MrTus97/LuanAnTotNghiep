package com.example.mrtus.demoapp.feature.login.view;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mrtus.demoapp.R;
import com.example.mrtus.demoapp.common.Common;
import com.example.mrtus.demoapp.feature.account.AccountFragment;
import com.example.mrtus.demoapp.feature.login.model.LoginModel;
import com.example.mrtus.demoapp.feature.login.presenter.LoginPresenter;
import com.example.mrtus.demoapp.feature.createAccount.view.CreateAccountFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment implements ILoginFragment {

    private View view;
    private Button btnLogin;
    private TextView tvSignUp;
    private Context context;
    private LoginPresenter loginPresenter;
    private EditText edtPhone, edtPassword;
    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_login, container, false);
        initXml();
        setEvent();
        return view;
    }

    @Override
    public void onAttach(Context context) {
        this.context = context;
        super.onAttach(context);
    }

    private void setEvent() {

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = edtPhone.getText().toString();
                String password = edtPassword.getText().toString();
                loginPresenter.login(phone,password);
            }
        });
        tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Common.loadFragment(new CreateAccountFragment(),context);
            }
        });
    }

    private void initXml() {
        btnLogin = view.findViewById(R.id.btnLoginAct_login);
        tvSignUp = view.findViewById(R.id.tvLoginAct_signUp);
        edtPassword = view.findViewById(R.id.edtLoginAct_password);
        edtPhone = view.findViewById(R.id.edtLoginAct_phone);
        loginPresenter = new LoginPresenter(this);

    }

    @Override
    public void loginSuccess(LoginModel loginModel) {
        Common.setLogin(loginModel.getToken());
        Common.loadFragment(new AccountFragment(),context);
    }

    @Override
    public void loginFailure(String message) {
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void anotherReason(String message) {
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }
}
