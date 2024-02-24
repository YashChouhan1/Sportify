package com.example.sportify;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/**
 * Authors -
 *     Swayam Sahu, Sourabh patware, Vicky Koushal, Yash Chouhan
 * **/
public class MainActivity extends AppCompatActivity {
    EditText editTextEmail, editTextPassword;
    Button buttonLogin;
    FirebaseAuth mAuth;

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





           // if(TextUtils.isEmpty(email)){
          //      Toast.makeText(MainActivity.this,"Enter email", Toast.LENGTH_SHORT).show();
          //      return;
          //  }
          //  if(TextUtils.isEmpty(password)){
          //      Toast.makeText(MainActivity.this,"Enter password", Toast.LENGTH_SHORT).show();
            //    return;
            //}

         //   mAuth = FirebaseAuth.getInstance();

//            mAuth.createUserWithEmailAndPassword(email, password)
//                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                        @Override
//                        public void onComplete(@NonNull Task<AuthResult> task) {
//                            if (task.isSuccessful()) {
//                                Toast.makeText(MainActivity.this, "Authentication Successful.",
//                                        Toast.LENGTH_SHORT).show();
//                                Intent intent = new Intent(getApplicationContext(), Home.class);
//                                startActivity(intent);
//                                finish();
//                            } else {
//
//                                Toast.makeText(MainActivity.this, "Authentication failed.",
//                                        Toast.LENGTH_SHORT).show();
//                            }
//                        }
//                    });


//            mAuth.signInWithEmailAndPassword(email, password)
//                    .addOnCompleteListener( new OnCompleteListener<AuthResult>() {
//                        @Override
//                        public void onComplete(@NonNull Task<AuthResult> task) {
//                            if (task.isSuccessful()) {
//                                Toast.makeText(MainActivity.this, "Authentication Successful.",
//                                        Toast.LENGTH_SHORT).show();
//                                Intent intent = new Intent(getApplicationContext(), Home.class);
//                                startActivity(intent);
//                                finish();
//                            } else {
//                                Toast.makeText(MainActivity.this, "Authentication failed.",
//                                        Toast.LENGTH_SHORT).show();
//                            }
//                        }
//
//               });

            if (isValidCredentials(email, password)) {
                // Credentials are valid, open Co-admin home page
                Intent intent = new Intent(MainActivity.this, Adduser.class);
                startActivity(intent);
                finish(); // Finish the LoginActivity so the user cannot go back to it
            } else {
                // Credentials are invalid, show error message
                Toast.makeText(MainActivity.this, "Invalid ID or password", Toast.LENGTH_SHORT).show();
            }

    });
}

    private boolean isValidCredentials(String enteredId, String enteredPassword) {
        // Define your predefined ID and password
        String validId = "admin";
        String validPassword = "admin123";


        // Check if the entered credentials match the predefined values
        return enteredId.equals(validId) && enteredPassword.equals(validPassword);
    }
}
