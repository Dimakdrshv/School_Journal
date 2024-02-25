package com.example.mini_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mini_project.databinding.K10Binding;
import com.example.mini_project.databinding.K1Binding;

public class K10 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        K10Binding binding = K10Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayAdapter <CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.K10, android.R.layout.simple_list_item_1);
        binding.LVS10.setAdapter(adapter);
        binding.Bback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(K10.this, Students.class);
                startActivity(intent);
            }
        });
    }
}
