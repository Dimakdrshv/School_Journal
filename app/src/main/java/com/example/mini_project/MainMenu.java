package com.example.mini_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mini_project.databinding.MainMenuBinding;

public class MainMenu extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainMenuBinding binding = MainMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, Teachers.class);
                startActivity(intent);
            }
        });
        binding.B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, Students.class);
                startActivity(intent);
            }
        });
        binding.B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, Pass.class);
                startActivity(intent);
            }
        });
        binding.B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, Employee.class);
                startActivity(intent);
            }
        });
        binding.B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, Elective.class);
                startActivity(intent);
            }
        });
        binding.B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, Section.class);
                startActivity(intent);
            }
        });
        binding.Journal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, Journal.class);
                startActivity(intent);
            }
        });
    }
}
