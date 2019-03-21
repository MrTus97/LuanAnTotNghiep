package com.example.mrtus.demoapp.feature.login.view;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.mrtus.demoapp.R;
import com.example.mrtus.demoapp.common.Common;
import com.example.mrtus.demoapp.common.FlagStatus;
import com.example.mrtus.demoapp.feature.home.view.HomeFragment;
import com.example.mrtus.demoapp.feature.login.model.LoginModel;
import com.example.mrtus.demoapp.feature.login.presenter.LoginPresenter;
import com.example.mrtus.demoapp.feature.signUp.SignUpFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment implements ILoginFragment {

    private View view;
    private Button btnLogin;
    private TextView tvSignUp;
    private Context context;
    private LoginPresenter loginPresenter;
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
                FlagStatus.isLogin = true;
                Common.loadFragment(new HomeFragment(),context);
            }
        });
        tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Common.loadFragment(new SignUpFragment(),context);
            }
        });
    }

    private void initXml() {
        btnLogin = view.findViewById(R.id.btnLoginAct_login);
        tvSignUp = view.findViewById(R.id.tvLoginAct_signUp);
        loginPresenter = new LoginPresenter(this);

    }

    @Override
    public void loginSuccess(LoginModel loginModel) {

    }

    @Override
    public void loginFailure(String message) {

    }

    @Override
    public void anotherReason(String message) {

    }
}
