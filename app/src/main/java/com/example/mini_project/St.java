package com.example.mini_project;

import static java.util.EnumSet.range;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mini_project.databinding.StBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class St extends AppCompatActivity {
    private EditText editText;
    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    private EditText editText4;
    private EditText editText5;
    private EditText editText6;
    private EditText editText7;
    private EditText editText8;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StBinding binding = StBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        String name = getIntent().getStringExtra("name");
        binding.TV1.setText(name);
        editText = findViewById(R.id.Russian);
        editText1 = findViewById(R.id.Math);
        editText2 = findViewById(R.id.Chemistry);
        editText3 = findViewById(R.id.Lit);
        editText4 = findViewById(R.id.Fiz);
        editText5 = findViewById(R.id.Geogr);
        editText6 = findViewById(R.id.Economic);
        editText7 = findViewById(R.id.Inf);
        editText8 = findViewById(R.id.Xor);
        InputFilter filter = new InputFilter() {
            public CharSequence filter(CharSequence source, int start, int end,
                                       Spanned dest, int dstart, int dend) {
                for (int i = start; i < end; i++) {
                    if (Character.isDigit(source.charAt(i))) {
                        int input = Integer.parseInt(String.valueOf(source.charAt(i)));
                        if (input < 2 || input > 5) {
                            return ""; // Если введенное число не входит в диапазон [2, 5], не добавляем его
                        }
                    } else {
                        return ""; // Если введен нецифровой символ, не добавляем его
                    }
                }
                return null; // Пропускаем ввод
            }
        };
        editText.setFilters(new InputFilter[] {filter}); // Устанавливаем фильтр для EditText
        editText1.setFilters(new InputFilter[] {filter}); // Устанавливаем фильтр для EditText
        editText2.setFilters(new InputFilter[] {filter}); // Устанавливаем фильтр для EditText
        editText3.setFilters(new InputFilter[] {filter}); // Устанавливаем фильтр для EditText
        editText4.setFilters(new InputFilter[] {filter}); // Устанавливаем фильтр для EditText
        editText5.setFilters(new InputFilter[] {filter}); // Устанавливаем фильтр для EditText
        editText6.setFilters(new InputFilter[] {filter}); // Устанавливаем фильтр для EditText
        editText7.setFilters(new InputFilter[] {filter}); // Устанавливаем фильтр для EditText
        editText8.setFilters(new InputFilter[] {filter}); // Устанавливаем фильтр для EditText
        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        SharedPreferences sharedPreferences1 = getSharedPreferences("MyPrefs1", Context.MODE_PRIVATE);
        SharedPreferences sharedPreferences2 = getSharedPreferences("MyPrefs2", Context.MODE_PRIVATE);
        SharedPreferences sharedPreferences3 = getSharedPreferences("MyPrefs3", Context.MODE_PRIVATE);
        SharedPreferences sharedPreferences4 = getSharedPreferences("MyPrefs4", Context.MODE_PRIVATE);
        SharedPreferences sharedPreferences5 = getSharedPreferences("MyPrefs5", Context.MODE_PRIVATE);
        SharedPreferences sharedPreferences6 = getSharedPreferences("MyPrefs6", Context.MODE_PRIVATE);
        SharedPreferences sharedPreferences7 = getSharedPreferences("MyPrefs7", Context.MODE_PRIVATE);
        SharedPreferences sharedPreferences8 = getSharedPreferences("MyPrefs8", Context.MODE_PRIVATE);
        String savedText = sharedPreferences.getString("key", "");
        String savedText1 = sharedPreferences1.getString("key", "");
        String savedText2 = sharedPreferences2.getString("key", "");
        String savedText3 = sharedPreferences3.getString("key", "");
        String savedText4 = sharedPreferences4.getString("key", "");
        String savedText5 = sharedPreferences5.getString("key", "");
        String savedText6 = sharedPreferences6.getString("key", "");
        String savedText7 = sharedPreferences7.getString("key", "");
        String savedText8 = sharedPreferences8.getString("key", "");
        editText.setText(savedText);
        editText1.setText(savedText1);
        editText2.setText(savedText2);
        editText3.setText(savedText3);
        editText4.setText(savedText4);
        editText5.setText(savedText5);
        editText6.setText(savedText6);
        editText7.setText(savedText7);
        editText8.setText(savedText8);
        binding.Bback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(St.this, Journal.class);
                startActivity(intent);
            }
        });
        binding.Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Данные сохранены", Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        SharedPreferences sharedPreferences1 = getSharedPreferences("MyPrefs1", Context.MODE_PRIVATE);
        SharedPreferences sharedPreferences2 = getSharedPreferences("MyPrefs2", Context.MODE_PRIVATE);
        SharedPreferences sharedPreferences3 = getSharedPreferences("MyPrefs3", Context.MODE_PRIVATE);
        SharedPreferences sharedPreferences4 = getSharedPreferences("MyPrefs4", Context.MODE_PRIVATE);
        SharedPreferences sharedPreferences5 = getSharedPreferences("MyPrefs5", Context.MODE_PRIVATE);
        SharedPreferences sharedPreferences6 = getSharedPreferences("MyPrefs6", Context.MODE_PRIVATE);
        SharedPreferences sharedPreferences7 = getSharedPreferences("MyPrefs7", Context.MODE_PRIVATE);
        SharedPreferences sharedPreferences8 = getSharedPreferences("MyPrefs8", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        SharedPreferences.Editor editor1 = sharedPreferences1.edit();
        SharedPreferences.Editor editor2 = sharedPreferences2.edit();
        SharedPreferences.Editor editor3 = sharedPreferences3.edit();
        SharedPreferences.Editor editor4 = sharedPreferences4.edit();
        SharedPreferences.Editor editor5 = sharedPreferences5.edit();
        SharedPreferences.Editor editor6 = sharedPreferences6.edit();
        SharedPreferences.Editor editor7 = sharedPreferences7.edit();
        SharedPreferences.Editor editor8 = sharedPreferences8.edit();
        editor.putString("key", editText.getText().toString());
        editor1.putString("key", editText1.getText().toString());
        editor2.putString("key", editText2.getText().toString());
        editor3.putString("key", editText3.getText().toString());
        editor4.putString("key", editText4.getText().toString());
        editor5.putString("key", editText5.getText().toString());
        editor6.putString("key", editText6.getText().toString());
        editor7.putString("key", editText7.getText().toString());
        editor8.putString("key", editText8.getText().toString());
        editor.apply();
        editor1.apply();
        editor2.apply();
        editor3.apply();
        editor4.apply();
        editor5.apply();
        editor6.apply();
        editor7.apply();
        editor8.apply();
    }
}
