package com.example.mini_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mini_project.databinding.TeachersBinding;

public class Teachers extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TeachersBinding binding = TeachersBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.Bback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Teachers.this, MainMenu.class);
                startActivity(intent);
            }
        });
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.T, android.R.layout.simple_list_item_1);
        binding.LVT.setAdapter(adapter);
    }
}
