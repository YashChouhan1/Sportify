package com.example.sportify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import com.google.firebase.auth.FirebaseAuth;

public class add_student extends AppCompatActivity {

    private EditText editTextStudentEmail, editTextStudentPassword;
    private Button btnAddStudent;
    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);

        editTextStudentEmail = findViewById(R.id.editTextStudentEmail);
        editTextStudentPassword = findViewById(R.id.editTextStudentPassword);
        btnAddStudent = findViewById(R.id.btnAddStudent);

        firebaseAuth = FirebaseAuth.getInstance();

        btnAddStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addStudentToFirebaseAuth();
            }
        });
    }

    private void addStudentToFirebaseAuth() {
        String email = editTextStudentEmail.getText().toString();
        String password = editTextStudentPassword.getText().toString();

        // Validate email and password (optional)

        firebaseAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(new OnCompleteListener() {
                    @Override
                    public void onComplete(@NonNull Task task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(add_student.this, "Student added successfully", Toast.LENGTH_SHORT).show();
                            // Clear input fields after successful addition
                            editTextStudentEmail.setText("");
                            editTextStudentPassword.setText("");
                        } else {
                            Toast.makeText(add_student.this, "Failed to add student: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}