package com.example.mrtus.demoapp.feature.account;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.mrtus.demoapp.R;
import com.example.mrtus.demoapp.common.FlagStatus;
import com.example.mrtus.demoapp.feature.login.LoginActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class AccountFragment extends Fragment {

    private View view;
    private ImageButton btnLogout;

    public AccountFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_account, container, false);
        initXml();
        setEvent();
        return view;
    }

    private void setEvent() {
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FlagStatus.isLogin = false;
                startActivity(new Intent(getContext(), LoginActivity.class));
            }
        });
    }

    private void initXml() {
        btnLogout = view.findViewById(R.id.imbAccountFra_logout);
    }


}
