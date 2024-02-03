package com.example.sportify;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Authors -
 *     Swayam Sahu, Sourabh patware, Vicky Koushal, Yash Chouhan
 * **/
public class MainActivity extends AppCompatActivity {
    EditText editTextEmail, editTextPassword;
    Button buttonLogin;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEmail= findViewById(R.id.email);
        editTextPassword = findViewById(R.id.password);
        buttonLogin = findViewById(R.id.login_btn);

        buttonLogin.setOnClickListener(view -> {
            String email, password;
            email = String.valueOf(editTextEmail.getText());
            password = String.valueOf(editTextPassword.getText());

            if(TextUtils.isEmpty(email)){
                Toast.makeText(MainActivity.this,"Enter email", Toast.LENGTH_SHORT).show();
                return;
            }
            if(TextUtils.isEmpty(password)){
                Toast.makeText(MainActivity.this,"Enter password", Toast.LENGTH_SHORT).show();
            }
        });
    }
}