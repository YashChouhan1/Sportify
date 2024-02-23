package com.example.sportify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sportify.databinding.ActivityHomeBinding;


public class Home extends AppCompatActivity {

    ActivityHomeBinding binding;

    private final HomeFragment homeFragment  = new HomeFragment();
    private final ProfileFragment profileFragment  = new ProfileFragment();
    private final SettingsFragment settingsFragment = new SettingsFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(homeFragment);


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