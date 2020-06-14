package com.example.annang;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter <Word> {

    private int ColorResourceId;

    public WordAdapter(Context context , ArrayList<Word> Words, int colorResourceId){
        super(context, 0, Words);
        ColorResourceId = colorResourceId;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        }
        Word currentWord = getItem(position);

        TextView annangTextView = (TextView) listItemView.findViewById(R.id.annang_text_view);
        annangTextView.setText(currentWord.getmAnnangTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getmDefaultTranslation());

        ImageView defaultImage = (ImageView) listItemView.findViewById(R.id.image);

        if (currentWord.hasImage()) {
            defaultImage.setImageResource(currentWord.getImageResourceId());

            defaultImage.setVisibility(View.VISIBLE);
        }
        else
        {
            defaultImage.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(), ColorResourceId);

        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}







