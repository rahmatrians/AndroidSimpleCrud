package com.modul9.kampusku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
public class Splashscreen extends AppCompatActivity {
    private int waktu_loading=4000;
    //4000=4 detik
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
//setelah loading maka akan langsung berpindah ke Main activity
                Intent home = new Intent(Splashscreen.this,
                        MainActivity.class);
                startActivity(home);
                finish();
            }
        }, waktu_loading);
    }
}