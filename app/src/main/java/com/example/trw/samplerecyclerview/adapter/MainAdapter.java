package com.example.trw.samplerecyclerview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.trw.samplerecyclerview.R;
import com.example.trw.samplerecyclerview.adapter.holder.BaseViewHolder;
import com.example.trw.samplerecyclerview.adapter.holder.CardViewHolder;
import com.example.trw.samplerecyclerview.adapter.item.BaseItem;
import com.example.trw.samplerecyclerview.adapter.item.CardViewItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TRW on 12/8/2560.
 */

public class MainAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private List<BaseItem> itemList = new ArrayList<>();

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v;

        if (viewType == ViewType.TYPE_CARD_VIEW) {
            v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_item, parent, false);
            return new CardViewHolder(v);
        }

        throw new RuntimeException("type is not match");
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        BaseItem i = itemList.get(position);
        if (holder instanceof CardViewHolder) {
            CardViewItem cardViewItem = (CardViewItem) i;
            ((CardViewHolder) holder).setImage(cardViewItem.getImage());
            ((CardViewHolder) holder).setText(cardViewItem.getText());
        }
    }

    @Override
    public int getItemCount() {
        if (!itemList.isEmpty() || itemList != null) {
            return itemList.size();
        }
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        return itemList.get(position).getType();
    }

    public void setItemList(List<BaseItem> itemList) {
        this.itemList = itemList;

        notifyDataSetChanged();
    }
}
