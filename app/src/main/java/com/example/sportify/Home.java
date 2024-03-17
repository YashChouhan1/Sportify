package com.example.sportify;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sportify.databinding.ActivityHomeBinding;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Home extends AppCompatActivity {

    ActivityHomeBinding binding;

    private final HomeFragment homeFragment  = new HomeFragment();
    private final ProfileFragment profileFragment  = new ProfileFragment();
    private final SettingsFragment settingsFragment = new SettingsFragment();
    private DatabaseReference mDatabase;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(homeFragment);

        mDatabase = FirebaseDatabase.getInstance().getReference().child("events");



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