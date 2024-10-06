package com.mertyeniadim.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ArrayAdapterActivity extends ListActivity {

    static final String[] ANIMALS = new String[] { "Ant", "Bear", "Bird", "Cat",
    "Dog", "Donkey", "Elephant", "Giraffe", "Goat", "Monkey",
    "Pig", "Rat", "Snake", "Spider" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String >(this, R.layout.activity_array_adapter,ANIMALS));

        ListView ListView = getListView();
        ListView.setTextFilterEnabled(true);

        ListView.setOnItemClickListener((parent, view, position, id) -> Toast.makeText(getApplicationContext(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show());
    }
}
