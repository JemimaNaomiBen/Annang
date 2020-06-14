package com.example.annang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> Words = new ArrayList<>();

        Words.add(new Word("Father", "Ette", R.drawable.family_father));
        Words.add(new Word("Mother", "Eka", R.drawable.family_mother));
        Words.add(new Word("GrandFather", "Ette Ette", R.drawable.family_grandfather));
        Words.add(new Word("GrandMother", "Ekam", R.drawable.family_grandmother));
        Words.add(new Word("First Son", "Akpan", R.drawable.family_older_brother));
        Words.add(new Word("Second Son", "Udo", R.drawable.family_younger_brother));
        Words.add(new Word("First Daughter", "Adiaha", R.drawable.family_older_sister));
        Words.add(new Word("Second Daughter", "Nwa", R.drawable.family_younger_sister));
        Words.add(new Word("Baby", "Nsek ayen", R.drawable.family_baby));
        Words.add(new Word("Sibling", "Ayaka", R.drawable.family_sibling));


        WordAdapter adapter = new WordAdapter(this, Words, R.color.family_color);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}

