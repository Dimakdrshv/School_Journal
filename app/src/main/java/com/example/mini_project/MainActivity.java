package com.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mini_project.databinding.ActivityMainBinding;
import com.example.mini_project.databinding.LoginBinding;
import com.example.mini_project.databinding.MainMenuBinding;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private String Login = "admin";
    private String Password = "1234";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LoginBinding binding = LoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.Password.setTransformationMethod(new PasswordTransformationMethod());
        binding.signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.Login.getText().toString().equals(Login) && binding.Password.getText().toString().equals(Password)) {
                    Toast.makeText(getApplicationContext(), "Вы вошли как администратор", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, MainMenu.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Вы неверно ввели данные", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}