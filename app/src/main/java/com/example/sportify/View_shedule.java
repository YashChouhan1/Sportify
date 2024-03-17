package com.example.sportify;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

public class View_shedule extends AppCompatActivity {

    private CalendarView calendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_shedule);


        calendarView = findViewById(R.id.calendarView);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                // Handle date selection here
                String selectedDate = dayOfMonth + "/" + (month + 1) + "/" + year;
                Toast.makeText(View_shedule.this, "Selected Date: " + selectedDate, Toast.LENGTH_SHORT).show();
            }
        });
    }
}