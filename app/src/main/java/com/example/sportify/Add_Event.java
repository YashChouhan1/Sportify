package com.example.sportify;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.example.sportify.Model.Event;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Add_Event extends AppCompatActivity {

    private EditText editTextEventName, editTextEventDescription;
    private Button btnAddEvent;

    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);

        // Initialize Firebase Realtime Database
        mDatabase = FirebaseDatabase.getInstance().getReference("events");

        // Find views
        editTextEventName = findViewById(R.id.editTextEventName);
        editTextEventDescription = findViewById(R.id.editTextEventDescription);
        btnAddEvent = findViewById(R.id.btnAddEvent);

        // Set click listener for Add Event Button
        btnAddEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get event name and description from EditText fields
                String eventName = editTextEventName.getText().toString();
                String eventDescription = editTextEventDescription.getText().toString();

                // Check if event name and description are not empty
                if (!eventName.isEmpty() && !eventDescription.isEmpty()) {
                    // Add event to Firebase  Database
                    addEventToDatabase(eventName, eventDescription);
                } else {
                    // Display error message if event name or description is empty
                    Toast.makeText(Add_Event.this, "Please enter event name and description", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void addEventToDatabase(String eventName, String eventDescription) {
        // Generate a unique key for the event
        String eventId = mDatabase.push().getKey();

        // Create an Event object with the provided name and description
        Event event = new Event(eventId, eventName, eventDescription);

        // Add the event to the "events" node in the database with the generated key
        mDatabase.child(eventId).setValue(event)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            // Event added successfully
                            Toast.makeText(Add_Event.this, "Event added successfully", Toast.LENGTH_SHORT).show();
                        } else {
                            // Failed to add event
                            Toast.makeText(Add_Event.this, "Failed to add event", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}
