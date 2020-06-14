package com.example.annang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MealsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> Words = new ArrayList<>();


        Words.add(new Word("Beans", "Nkoti", R.drawable.food_bean));
        Words.add(new Word("Yam", "Edia Mbakara", R.drawable.food_yam));
        Words.add(new Word("Banana", "Mboro", R.drawable.food_banana));
        Words.add(new Word("Fish", "Iyak", R.drawable.food_fish));
        Words.add(new Word("Paw-paw", "Udia", R.drawable.food_pawpaw));
        Words.add(new Word("Avocado Pear", "Eben Mbakara", R.drawable.food_avocado));
        Words.add(new Word("Onions", "Ayim", R.drawable.food_onion));
        Words.add(new Word("Pepper", "Ntuen", R.drawable.food_pepper));
        Words.add(new Word("Corn", "Akpakpa", R.drawable.food_corn));
        Words.add(new Word("Coconut", "Isip", R.drawable.food_coconut));




        WordAdapter adapter = new WordAdapter(this, Words, R.color.meals_color);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}
