package com.example.second_almazbekov_beksultan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Advanceable;
import android.widget.EditText;
import android.widget.ImageView;

public class Send_message extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);


        // Получаем ссылку на WebView
        WebView gifWebView = findViewById(R.id.gif_image_view);

        // Включаем поддержку JavaScript
        WebSettings webSettings = gifWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Открываем GIF-изображение в WebView
        gifWebView.loadUrl("file:///android_res/raw/back.gif");

        // Позволяет просматривать GIF-изображение внутри WebView
        gifWebView.setWebViewClient(new WebViewClient());

    }

    public void sendMessage(View view){
        EditText editText = findViewById(R.id.editTextTextMultiLine);
        String value = editText.getText().toString();
        shareMessage(value);
    }
    private void shareMessage(String message) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT, message);
        intent.setType("text/plain");
        startActivity(Intent.createChooser(intent, "Поделиться с помощью:"));
    }

}