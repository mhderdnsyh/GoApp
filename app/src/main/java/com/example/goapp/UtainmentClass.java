package com.example.goapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class UtainmentClass extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.utainment);
    }
    public void clickupdates(View View) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void clickuplan2(View View) {
        Intent intent = new Intent(this, UplanClass.class);
        startActivity(intent);

    }
}
