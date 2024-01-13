package com.example.sportify;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

/**
 * Authors -
 *     Swayam Sahu, Sourabh patware, Vicky Koushal, Yash Chouhan
 * **/
public class MainActivity extends AppCompatActivity {
//<<<<<<<<< Temporary merge branch 1

//=========
    TextInputEditText editTextEmail, editTextPassword;
    Button buttonLogin;
//>>>>>>>>> Temporary merge branch 2
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//<<<<<<<<< Temporary merge branch 1
//=========

        editTextEmail= findViewById(R.id.email);
        editTextPassword = findViewById(R.id.password);
        buttonLogin = findViewById(R.id.login_btn);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email, password;
                email = String.valueOf(editTextEmail.getText());
                password = String.valueOf(editTextPassword.getText());

                if(TextUtils.isEmpty(email)){
                    Toast.makeText(MainActivity.this,"Enter email", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(password)){
                    Toast.makeText(MainActivity.this,"Enter password", Toast.LENGTH_SHORT).show();
                    return;
                }

            }
        });
//>>>>>>>>> Temporary merge branch 2
    }
}