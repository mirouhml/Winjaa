package com.dev.winjaa;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.RequiresApi;

import java.util.Objects;

public class MyAppWebViewClient extends WebViewClient {
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
