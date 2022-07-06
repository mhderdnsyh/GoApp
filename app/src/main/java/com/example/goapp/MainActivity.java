package com.example.goapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.updates);
    }

    public void clickuplan(View view) {
        Intent intent = new Intent(this, UplanClass.class);
        startActivity(intent);
    }

    public void clickutainment(View view) {
        Intent intent = new Intent(this, UtainmentClass.class);
        startActivity(intent);
    }
    public void clickpromo(View view) {
        Intent intent = new Intent(this,PembayaranClass.class);
        startActivity(intent);
    }
}