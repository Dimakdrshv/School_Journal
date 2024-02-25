package com.example.mini_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mini_project.databinding.EmployeeBinding;

public class Employee extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EmployeeBinding binding = EmployeeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.A, android.R.layout.simple_list_item_1);
        binding.A.setAdapter(adapter);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.R1, android.R.layout.simple_list_item_1);
        binding.R1.setAdapter(adapter1);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.K, android.R.layout.simple_list_item_1);
        binding.K.setAdapter(adapter2);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.M, android.R.layout.simple_list_item_1);
        binding.M.setAdapter(adapter3);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this, R.array.O, android.R.layout.simple_list_item_1);
        binding.O.setAdapter(adapter4);
        binding.Bback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Employee.this, MainMenu.class);
                startActivity(intent);
            }
        });
    }
}
