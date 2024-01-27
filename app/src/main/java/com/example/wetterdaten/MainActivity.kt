package com.example.wetterdaten

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.loadUrl("https://dyn.doc200.de/wetter/DISP.php")
            myWebView.getSettings().setLoadsImagesAutomatically(true)
            myWebView.getSettings().setJavaScriptEnabled(true)
            myWebView.getSettings().setBuiltInZoomControls(true)
            myWebView.setInitialScale(220)


    }


}


