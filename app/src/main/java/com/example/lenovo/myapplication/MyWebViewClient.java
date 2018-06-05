package com.example.lenovo.myapplication;

import android.content.Context;
import android.net.Uri;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by lenovo on 05-06-2018.
 */

public class MyWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url){

        if(Uri.parse(url).getHost().equals("http://demo.tutorialzine.com/2012/04/mobile-touch-gallery/")){
            return false;
        }
        return true;
    }

}
