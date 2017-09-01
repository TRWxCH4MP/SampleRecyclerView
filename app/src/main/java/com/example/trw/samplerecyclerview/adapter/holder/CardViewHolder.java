package com.example.trw.samplerecyclerview.adapter.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.trw.samplerecyclerview.R;

/**
 * Created by TRW on 13/8/2560.
 */

public class CardViewHolder extends BaseViewHolder{

    private ImageView imageView;
    private TextView textView;

    public CardViewHolder(View itemView) {
        super(itemView);

        imageView = (ImageView) itemView.findViewById(R.id.imageView);
        textView = (TextView) itemView.findViewById(R.id.textView);
    }

    public void setImage(int image) {
        imageView.setImageResource(image);
    }

    public void setText(String text) {
        textView.setText(text);
    }
}
