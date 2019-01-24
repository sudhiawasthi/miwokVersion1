package com.example.android.miwokk;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentWord=getItem(position);
        TextView MiwokTextView = (TextView) listItemView.findViewById(R.id.first_view);
        MiwokTextView.setText(currentWord.getmMiwokkTranslation());
        TextView DefaultTextView = (TextView) listItemView.findViewById(R.id.second_view);
        DefaultTextView.setText(currentWord.getmDefaultTranslation());
        ImageView image = (ImageView) listItemView.findViewById(R.id.imageView);
        if(currentWord.hasImage()) {

            image.setImageResource(currentWord.getmImageid());
        }
        else
        {
            image.setVisibility(View.GONE);
        }
        return listItemView;
    }
    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }
}
