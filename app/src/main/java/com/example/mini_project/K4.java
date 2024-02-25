package com.example.mini_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mini_project.databinding.K1Binding;
import com.example.mini_project.databinding.K4Binding;

public class K4 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        K4Binding binding = K4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayAdapter <CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.K4, android.R.layout.simple_list_item_1);
        binding.LVS4.setAdapter(adapter);
        binding.Bback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(K4.this, Students.class);
                startActivity(intent);
            }
        });
    }
}
