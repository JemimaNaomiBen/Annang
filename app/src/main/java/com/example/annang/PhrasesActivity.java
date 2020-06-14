package com.example.annang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> Words = new ArrayList<>();

        Words.add(new Word("Come here!", "Di mi"));
        Words.add(new Word("Goodmorning!", "Amesiere!"));
        Words.add(new Word("Goodnight!", "Asiere!"));
        Words.add(new Word("Welcome", "Ame di"));
        Words.add(new Word("Welcome back", "Ameyong"));
        Words.add(new Word("How is it?", "Abadie?"));
        Words.add(new Word("What is it?", "Adodie?"));
        Words.add(new Word("What is your name?", "Akere die?"));
        Words.add(new Word("Stand aside", "Sike daa"));
        Words.add(new Word("This is my mother", "Eka mmi ade mi"));
        Words.add(new Word("My beautiful love", "Uyai ima mmi"));
        Words.add(new Word("I'm from Ikot Ekpene", "Ami nto Ikot Ekpene"));
        Words.add(new Word("I love you", "Ami mme uma fien"));
        Words.add(new Word("I am a teacher", "Ami nde titia"));
        Words.add(new Word("Sit down", "Suuk tie"));

        WordAdapter adapter = new WordAdapter(this, Words, R.color.phrases_color);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}

