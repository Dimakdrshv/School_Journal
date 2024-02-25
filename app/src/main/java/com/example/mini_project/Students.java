package com.example.mini_project;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mini_project.databinding.StudentsBinding;

public class Students extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StudentsBinding binding = StudentsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.Bback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Students.this, MainMenu.class);
                startActivity(intent);
            }
        });
        binding.K1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Students.this, K1.class);
                startActivity(intent);
            }
        });
        binding.K2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Students.this, K2.class);
                startActivity(intent);
            }
        });
        binding.K3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Students.this, K3.class);
                startActivity(intent);
            }
        });
        binding.K4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Students.this, K4.class);
                startActivity(intent);
            }
        });
        binding.K5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Students.this, K5.class);
                startActivity(intent);
            }
        });
        binding.K6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Students.this, K6.class);
                startActivity(intent);
            }
        });
        binding.K7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Students.this, K7.class);
                startActivity(intent);
            }
        });
        binding.K8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Students.this, K8.class);
                startActivity(intent);
            }
        });
        binding.K9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Students.this, K9.class);
                startActivity(intent);
            }
        });
        binding.K10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Students.this, K10.class);
                startActivity(intent);
            }
        });
        binding.K11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Students.this, K11.class);
                startActivity(intent);
            }
        });
    }
}
