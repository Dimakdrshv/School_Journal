package com.example.mini_project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mini_project.databinding.K1Binding;

import java.util.Random;

public class K1 extends AppCompatActivity {
    View view;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        K1Binding binding = K1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.K1, android.R.layout.simple_list_item_1);
        binding.LVS1.setAdapter(adapter);
        binding.Bback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(K1.this, Students.class);
                startActivity(intent);
            }
        });
    }
}

