package com.example.annang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> Words = new ArrayList<>();

        Words.add(new Word("Red", "Ida-idad", R.drawable.color_red));
        Words.add(new Word("White", "Afia", R.drawable.color_white));
        Words.add(new Word("Black", "Awewen", R.drawable.color_black));
        Words.add(new Word("Green", "Awawa", R.drawable.color_green));
        Words.add(new Word("Blue", "Blu-blu", R.drawable.color_blue));
        Words.add(new Word("Yellow", "jello-jello", R.drawable.color_mustard_yellow));


        WordAdapter adapter = new WordAdapter(this, Words, R.color.colors_color);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}
