package com.example.mini_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mini_project.databinding.PassBinding;

public class Pass extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PassBinding binding = PassBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.Bback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pass.this, MainMenu.class);
                startActivity(intent);
            }
        });
        ArrayAdapter <CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Passes, android.R.layout.simple_list_item_1);
        binding.LVPass.setAdapter(adapter);
    }
}
