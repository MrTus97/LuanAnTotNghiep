package com.example.mrtus.demoapp.feature.createAccount.view;


import android.content.Context;
import android.content.Intent;
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
import com.example.mrtus.demoapp.feature.createAccount.presenter.CreateAccountPresenter;
import com.example.mrtus.demoapp.feature.home.view.HomeFragment;
import com.example.mrtus.demoapp.feature.login.view.LoginFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class CreateAccountFragment extends Fragment implements ICreateAccountFragment {


    private  View view;
    private Button btnSignUp;
    private TextView tvLoginIn;
    private Context context;
    private EditText edtPhone,edtName,edtTeamName,edtPassword,edtRePassword;
    private CreateAccountPresenter createAccountPresenter;
    public CreateAccountFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_sign_up, container, false);
        initXml();
        setEvent();
        return view;
    }

    @Override
    public void onAttach(Context context) {
        this.context = context;
        super.onAttach(context);
    }

    private void initXml() {
        btnSignUp = view.findViewById(R.id.btnSignUpAct_signUp);
        tvLoginIn = view.findViewById(R.id.tvSignUpAct_SignIn);
        edtName = view.findViewById(R.id.edtSignUpAct_name);
        edtPhone = view.findViewById(R.id.edtSignUpAct_phone);
        edtTeamName = view.findViewById(R.id.edtSignUpAct_teamName);
        edtPassword = view.findViewById(R.id.edtSignUpAct_password);
        edtRePassword = view.findViewById(R.id.edtSignUpAct_retypePassword);
        //MVP
        createAccountPresenter = new CreateAccountPresenter(this);
    }

    private void setEvent() {
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edtName.getText().toString();
                String phone = edtPhone.getText().toString();
                String teamName= edtTeamName.getText().toString();
                String password = edtPassword.getText().toString();
                String rePassword = edtRePassword.getText().toString();
                if (phone.isEmpty() || phone.length() < 9 || phone.charAt(0) != '0') {
                    edtPhone.setError("Valid number is required");
                    edtPhone.requestFocus();
                    return;
                }else if (!password.equals(rePassword)){
                    Toast.makeText(context,"Hai mật khẩu không giống nhau",Toast.LENGTH_LONG).show();
                    return;
                }else{
                    createAccountPresenter.createAccount(phone, name, teamName, password);
                }
            }
        });
        tvLoginIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Common.loadFragment(new LoginFragment(),context);
            }
        });
    }

    @Override
    public void createAccountSuccess(String messgae) {
        Fragment fragment = new VerifyAccountFragment();
        String phone = edtPhone.getText().toString();
        phone = "+84" + phone.substring(1);
        Bundle bundle = new Bundle();
        bundle.putString("phone",phone);
        fragment.setArguments(bundle);
        Common.loadFragment(fragment, context);
    }

    @Override
    public void createAccountFailure(String message) {
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void anotherReason(String message) {
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }
}
