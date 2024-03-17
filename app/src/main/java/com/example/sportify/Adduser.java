package com.example.sportify;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Adduser extends AppCompatActivity {

     EditText editTextStudentEmail, editTextStudentPassword;
     Button btnAddStudent;

     FirebaseAuth mAuth;
     DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adduser);


        // Initialize Firebase Authentication
        mAuth = FirebaseAuth.getInstance();

        // Initialize Firebase Realtime Database
        mDatabase = FirebaseDatabase.getInstance().getReference("students");

        // Find views
        editTextStudentEmail = findViewById(R.id.editTextStudentEmail);
        editTextStudentPassword = findViewById(R.id.editTextStudentPassword);
        btnAddStudent = findViewById(R.id.btnAddStudent);

        // Set click listener for Add Student Button
        // Set click listener for Add Student Button
        btnAddStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get email and password from EditText fields
                String u_email = editTextStudentEmail.getText().toString();
                String u_password = editTextStudentPassword.getText().toString();

                // Create new user with email and password
                mAuth.createUserWithEmailAndPassword(u_email, u_password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Sign up successful
                                    FirebaseUser user = mAuth.getCurrentUser();
                                    String userId = user.getUid();

                                    // Add student information to Realtime Database
                                    Student student = new Student(u_email);
                                    mDatabase.child(userId).setValue(student);

                                    // Inform user about successful sign up
                                    Toast.makeText(Adduser.this, "Student added successfully", Toast.LENGTH_SHORT).show();
                                } else {
                                    // Sign up failed
                                    Toast.makeText(Adduser.this, "Failed to add student", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });

    }
    }
