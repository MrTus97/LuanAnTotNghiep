package com.example.mrtus.demoapp.feature.signUp;


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
import com.example.mrtus.demoapp.feature.home.view.HomeFragment;
import com.example.mrtus.demoapp.feature.login.view.LoginFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class SignUpFragment extends Fragment {


    private  View view;
    private Button btnSignUp;
    private TextView tvLoginIn;
    private Context context;
    public SignUpFragment() {
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
    }

    private void setEvent() {
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Common.loadFragment(new HomeFragment(),context);
            }
        });
        tvLoginIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Common.loadFragment(new LoginFragment(),context);
            }
        });
    }
}
