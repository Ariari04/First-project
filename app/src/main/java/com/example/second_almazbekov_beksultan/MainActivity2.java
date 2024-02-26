package com.example.second_almazbekov_beksultan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    public void openCalculatorActivity(View view) {
        Intent intent = new Intent(this, Calculator.class);
        startActivity(intent);
    }
    public void openMessageSenderActivity(View view) {
        Intent intent = new Intent(this, Send_message.class);
        startActivity(intent);
    }
    public void openEmotionActivity(View view) {
        Intent intent = new Intent(this, Emotion.class);
        startActivity(intent);
    }
    public void exitApp(View view) {
        finish(); // Закрыть текущую активность и выйти из приложения
    }

}