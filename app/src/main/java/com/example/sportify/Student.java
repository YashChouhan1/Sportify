package com.example.sportify;

public class Student {
    private String email;
    private String name; // Add additional parameters as needed

    public Student() {
        // Default constructor required for calls to DataSnapshot.getValue(Student.class)
    }

    public Student(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public Student(String email) {

    }

    // Add getters and setters for additional parameters as needed
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

