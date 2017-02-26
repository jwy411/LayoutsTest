package com.example.naver.layoutstest;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by jwy on 2017-02-27.
 */

public class ListViewActivity extends Activity {
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView listView = (ListView) findViewById(R.id.video_list);

        adapter = new ArrayAdapter<String>(
            this
            , R.layout.listitem_clip_detail
            , R.id.txt_title
            , new ArrayList<String>(Arrays.asList(new String[]{"클립 제목 1", "클립 제목 2", "클립 제목 3"}))
        );
        listView.setAdapter(adapter);

        AdapterView.OnItemClickListener mMessageClickedHandler = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                Log.v("position", Integer.toString(position));
                Log.v("id", Long.toString(id));
            }
        };
        listView.setOnItemClickListener(mMessageClickedHandler);
    }

    public void onClickMore(View view) {
        Integer nextIndex = adapter.getCount() + 1;
        String title = "클립 제목 " + Integer.toString(nextIndex);
        adapter.add(title);
    }
}
