package com.example.peysbuk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ForgotPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        // final EditText username = findViewById(R.id.username1);
        // final EditText currentpw = findViewById(R.id.currentpassword);
        // final EditText newpw = findViewById(R.id.newpassword);

        final EditText currentpw = findViewById(R.id.currentpassword);

        final Button done = findViewById(R.id.done);
        final Button cancel = findViewById(R.id.cancel);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newpassword = "Password changed";
                Toast.makeText(getApplicationContext(), newpassword, Toast.LENGTH_LONG).show();
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ForgotPassword.this, com.example.peysbuk.ui.login.LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}