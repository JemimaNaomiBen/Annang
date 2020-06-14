package com.example.annang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> Words = new ArrayList<>();

        Words.add(new Word("One", "Ked",R.drawable.number_one));
        Words.add(new Word("Two","Iba", R.drawable.number_two));
        Words.add(new Word("Three", "Ita", R.drawable.number_three));
        Words.add(new Word("Four", "Inaang", R.drawable.number_four));
        Words.add(new Word("Five", "Ition", R.drawable.number_five) );
        Words.add(new Word("Six","Itio-ked", R.drawable.number_six));
        Words.add(new Word("Seven","Itia-aba", R.drawable.number_seven));
        Words.add(new Word("Eight", "Itia-ita", R.drawable.number_eight));
        Words.add(new Word("Nine", "Usuked", R.drawable.number_nine));
        Words.add(new Word("Ten", "Duop", R.drawable.number_ten));



        WordAdapter adapter = new WordAdapter(this, Words, R.color.numbers_color);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);



        }





        /*Log.v("NumbersActivity", "Word at index 0 :" + Words.get(0));
        Log.v("NumbersActivity", "Word at index 1 :" + Words.get(1));
        Log.v("NumbersActivity", "Word at index 2 :" + Words.get(2));
        Log.v("NumbersActivity", "Word at index 3 :" + Words.get(3));
        Log.v("NumbersActivity", "Word at index 4 :" + Words.get(4));
        Log.v("NumbersActivity", "Word at index 4 :" + Words.get(5));
        Log.v("NumbersActivity", "Word at index 4 :" + Words.get(6));
        Log.v("NumbersActivity", "Word at index 4 :" + Words.get(7));
        Log.v("NumbersActivity", "Word at index 4 :" + Words.get(8));
        Log.v("NumbersActivity", "Word at index 4 :" + Words.get(9));*/




    }

