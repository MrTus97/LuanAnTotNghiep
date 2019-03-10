package com.example.mrtus.demoapp.feature.signUp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mrtus.demoapp.R;
import com.example.mrtus.demoapp.feature.login.LoginActivity;

public class SignUpActivity extends AppCompatActivity {

    private Button btnSignUp;
    private TextView tvLoginIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        initXml();
        setEvent();
    }

    private void initXml() {
        btnSignUp = findViewById(R.id.btnSignUpAct_signUp);
        tvLoginIn = findViewById(R.id.tvSignUpAct_SignIn);
    }

    private void setEvent() {
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            }
        });
        tvLoginIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            }
        });
    }
}
