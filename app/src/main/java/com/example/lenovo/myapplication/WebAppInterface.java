package com.example.lenovo.myapplication;


import android.app.Activity;
import android.webkit.JavascriptInterface;


public class WebAppInterface {
    Activity mContext;
    WebAppInterface(Activity c){
        mContext = c;
    }
    @JavascriptInterface
    public void showToast(String toast) {
        mContext.finish();
    }
}
