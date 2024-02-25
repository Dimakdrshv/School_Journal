package com.example.mini_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import com.example.mini_project.databinding.JournalBinding;

public class Journal extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        JournalBinding binding = JournalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Students, android.R.layout.simple_list_item_1);
        binding.searchItem.setAdapter(adapter);
        binding.search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        binding.Bback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Journal.this, MainMenu.class);
                startActivity(intent);
            }
        });
        binding.searchItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedName = (String) parent.getItemAtPosition(position);
                Intent intent = new Intent(Journal.this, St.class);
                intent.putExtra("name", selectedName);
                startActivity(intent);
            }
        });
    }
}
