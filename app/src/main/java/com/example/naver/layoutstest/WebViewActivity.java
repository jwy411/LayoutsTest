package com.example.naver.layoutstest;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by jwy on 2017-02-27.
 */

public class WebViewActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView webView = new WebView(this);
        setContentView(webView);

        webView.loadUrl("http://m.tv.naver.com");
    }
}
