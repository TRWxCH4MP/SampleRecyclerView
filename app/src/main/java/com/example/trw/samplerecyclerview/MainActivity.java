package com.example.trw.samplerecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.trw.samplerecyclerview.adapter.MainAdapter;
import com.example.trw.samplerecyclerview.adapter.item.BaseItem;
import com.example.trw.samplerecyclerview.adapter.item.CardViewItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        adapter = new MainAdapter();
        adapter.setItemList(createItem());
        recyclerView.setAdapter(adapter);
    }

    private List<BaseItem> createItem() {
        List<BaseItem> itemList = new ArrayList<>();
        itemList.add(new CardViewItem()
                .setImage(R.mipmap.ic_launcher)
                .setText("Hello World"));
        itemList.add(new CardViewItem()
                .setImage(R.mipmap.ic_launcher_round)
                .setText("Hello RecyclerView"));
        itemList.add(new CardViewItem()
                .setImage(R.mipmap.ic_launcher)
                .setText("Hello Android"));
        return itemList;
    }
}
