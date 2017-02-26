package com.example.naver.layoutstest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.linearLayoutButton:
                clickLinearLayout();
                break;
            case R.id.webViewButton:
                clickWebView();
                break;
            case R.id.listViewButton:
                clickListView();
                break;
            default:
                break;
        }
    }

    private void clickLinearLayout() {
        Intent intent = new Intent(this, LinearLayoutActivity.class);
        startActivity(intent);
    }

    private void clickWebView() {
        Intent intent = new Intent(this, WebViewActivity.class);
        startActivity(intent);
    }

    private void clickListView() {
        Intent intent = new Intent(this, ListViewActivity.class);
        startActivity(intent);
    }
}
