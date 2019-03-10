package com.example.mrtus.demoapp.feature.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.TextView;

import com.example.mrtus.demoapp.R;
import com.example.mrtus.demoapp.common.FlagStatus;
import com.example.mrtus.demoapp.feature.signUp.SignUpActivity;
import com.example.mrtus.demoapp.feature.template.MainActivity;

public class LoginActivity extends AppCompatActivity {

    private Button btnLogin;
    private TextView tvSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initXml();
        setEvent();
    }

    private void setEvent() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FlagStatus.isLogin = true;
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initXml() {
        btnLogin = findViewById(R.id.btnLoginAct_login);
        tvSignUp = findViewById(R.id.tvLoginAct_signUp);

    }
}
