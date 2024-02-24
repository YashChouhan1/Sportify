package com.example.sportify;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;

import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sportify.databinding.ActivityHomeBinding;

public class Co_Admin_Home extends AppCompatActivity {

    LinearLayout AddEvent,adduser;
    ActivityHomeBinding binding;

    private final HomeFragment homeFragment  = new HomeFragment();
    private final ProfileFragment profileFragment  = new ProfileFragment();
    private final SettingsFragment settingsFragment = new SettingsFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_co_admin_home);
        replaceFragment(homeFragment);

         adduser = findViewById(R.id.adduser);
        AddEvent = findViewById(R.id.AddEvent);


        adduser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Co_Admin_Home.this,Adduser.class);
                startActivity(intent);
            }
        });

        AddEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Co_Admin_Home.this,Add_Event.class);
                startActivity(intent);
            }
        });

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {

            switch (item.getItemId())
            {
                case R.id.home:
                    replaceFragment(homeFragment);
                    break;
                case R.id.profile:
                    replaceFragment(profileFragment);
                    break;
                case R.id.settings:
                    replaceFragment(settingsFragment);
                    break;
            }

            return  true;

        });




    }

    private void replaceFragment(Fragment fragment) {
        // TODO: replace  container with actual id of fragment and uncomment it
        // getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();

    }
}
