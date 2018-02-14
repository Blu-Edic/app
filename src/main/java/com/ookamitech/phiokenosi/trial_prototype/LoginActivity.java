package com.ookamitech.phiokenosi.trial_prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText etUsername = (EditText) findViewById(R.id.etUsername);
    EditText etPassword = (EditText) findViewById(R.id.etPassword);
    Button bLogin = (Button) findViewById(R.id.bLogin);
    TextView regLink = (TextView) findViewById(R.id.tvRegisterLink);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        regLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);

                LoginActivity.this.startActivity(registerIntent);

            }
        });

        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(LoginActivity.this, ProfileActivity.class);
                LoginActivity.this.startActivity(loginIntent);
            }
        });
    }
}
