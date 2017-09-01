package com.example.trw.samplerecyclerview.adapter.item;

import com.example.trw.samplerecyclerview.adapter.MainAdapter;
import com.example.trw.samplerecyclerview.adapter.ViewType;

/**
 * Created by TRW on 13/8/2560.
 */

public class CardViewItem extends BaseItem {

    private int cardViewImage;
    private String cardViewText;

    public CardViewItem() {
        super(ViewType.TYPE_CARD_VIEW);
    }

    public int getImage() {
        return cardViewImage;
    }

    public CardViewItem setImage(int cardViewImage) {
        this.cardViewImage = cardViewImage;
        return this;
    }

    public String getText() {
        return cardViewText;
    }

    public CardViewItem setText(String cardViewText) {
        this.cardViewText = cardViewText;
        return this;
    }
}
