package com.example.mini_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mini_project.databinding.ElectiveBinding;

public class Elective extends AppCompatActivity {
    private boolean Z1 = false;
    private boolean Z2 = false;
    private boolean Z3 = false;
    private boolean Z4 = false;
    private boolean Z5 = false;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ElectiveBinding binding = ElectiveBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.Z1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Z1 == false) {
                    Toast.makeText(getApplicationContext(), "Вы записались на курс «Умная Россия»", Toast.LENGTH_SHORT).show();
                    Z1 = true;
                }
                else {
                    Toast.makeText(getApplicationContext(), "Вы уже записаны на данный курс", Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.Z11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Z1 == true) {
                    Toast.makeText(getApplicationContext(), "Вы отписались от курса «Умная Россия»", Toast.LENGTH_SHORT).show();
                    Z1 = false;
                }
                else {
                    Toast.makeText(getApplicationContext(), "Вы не были записаны на данный курс", Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.Z2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Z2 == false) {
                    Toast.makeText(getApplicationContext(), "Вы записались на курс «Здоровая душа»", Toast.LENGTH_SHORT).show();
                    Z2 = true;
                }
                else {
                    Toast.makeText(getApplicationContext(), "Вы уже записаны на данный курс", Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.Z22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Z2 == true) {
                    Toast.makeText(getApplicationContext(), "Вы отписались от курса «Здоровая душа»", Toast.LENGTH_SHORT).show();
                    Z2 = false;
                }
                else {
                    Toast.makeText(getApplicationContext(), "Вы не были записаны на данный курс", Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.Z3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Z3 == false) {
                    Toast.makeText(getApplicationContext(), "Вы записались на курс «Умелые пальчики»", Toast.LENGTH_SHORT).show();
                    Z3 = true;
                }
                else {
                    Toast.makeText(getApplicationContext(), "Вы уже записаны на данный курс", Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.Z33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Z3 == true) {
                    Toast.makeText(getApplicationContext(), "Вы отписались от курса «Умелые пальчики»", Toast.LENGTH_SHORT).show();
                    Z3 = false;
                }
                else {
                    Toast.makeText(getApplicationContext(), "Вы не были записаны на данный курс", Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.Z4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Z4 == false) {
                    Toast.makeText(getApplicationContext(), "Вы записались на курс «Отмывание денег»", Toast.LENGTH_SHORT).show();
                    Z4 = true;
                }
                else {
                    Toast.makeText(getApplicationContext(), "Вы уже записаны на данный курс", Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.Z44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Z4 == true) {
                    Toast.makeText(getApplicationContext(), "Вы отписались от курса «Отмывание денег»", Toast.LENGTH_SHORT).show();
                    Z4 = false;
                }
                else {
                    Toast.makeText(getApplicationContext(), "Вы не были записаны на данный курс", Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.Z5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Z5 == false) {
                    Toast.makeText(getApplicationContext(), "Вы записались на курс «Общий курс программирования на машинном коде»", Toast.LENGTH_SHORT).show();
                    Z5 = true;
                }
                else {
                    Toast.makeText(getApplicationContext(), "Вы уже записаны на данный курс", Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.Z55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Z5 == true) {
                    Toast.makeText(getApplicationContext(), "Вы отписались от курса «Общий курс программирования на машинном коде»", Toast.LENGTH_SHORT).show();
                    Z5 = false;
                }
                else {
                    Toast.makeText(getApplicationContext(), "Вы не были записаны на данный курс", Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.Bback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Elective.this, MainMenu.class);
                startActivity(intent);
            }
        });
    }
}