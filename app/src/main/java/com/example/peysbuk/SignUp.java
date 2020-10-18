package com.example.peysbuk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.peysbuk.ui.login.LoginActivity;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        final EditText firstname = findViewById(R.id.firstname);
        final EditText lastname = findViewById(R.id.lastname);
        final EditText birthdate = findViewById(R.id.birthdate);
        final Button done = findViewById(R.id.done);
        final Button cancel = findViewById(R.id.cancel);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String signup = "Your First name is " + firstname.getText().toString() + ",\nYour Last name is " + lastname.getText().toString() + ",\nand your birthdate is " + birthdate.getText().toString();
                Toast.makeText(getApplicationContext(), signup, Toast.LENGTH_LONG).show();
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp.this, com.example.peysbuk.ui.login.LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}