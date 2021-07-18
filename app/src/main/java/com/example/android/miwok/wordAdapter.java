package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class wordAdapter extends ArrayAdapter<word> {

    private int mcolorResourceId;

    public wordAdapter(Activity context, ArrayList<word> words, int colorResourceId) {
        super(context, 0, words);
        mcolorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        word currentWord = getItem(position);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView imageResourceView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentWord.hasimage()) {
            imageResourceView.setImageResource(currentWord.getImageResourceId());
            imageResourceView.setVisibility(View.VISIBLE);
        } else {
            imageResourceView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(), mcolorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
