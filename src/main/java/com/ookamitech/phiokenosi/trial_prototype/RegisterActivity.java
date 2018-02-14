package com.ookamitech.phiokenosi.trial_prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    EditText etUsername = (EditText) findViewById(R.id.etUsername);
    EditText etGender = (EditText) findViewById(R.id.etGender);
    EditText etOrio = (EditText) findViewById(R.id.etOrio);
    EditText etEmail = (EditText) findViewById(R.id.etEmail);
    EditText etPassword = (EditText) findViewById(R.id.etPassword);
    Button bReg = (Button) findViewById(R.id.bReg);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        bReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regIntent = new Intent(RegisterActivity.this, ProfileActivity.class);

                RegisterActivity.this.startActivity(regIntent);

            }
        });
    }
}
