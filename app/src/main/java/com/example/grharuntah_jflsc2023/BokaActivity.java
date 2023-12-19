package com.example.grharuntah_jflsc2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BokaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boka);
    }

    public void todetail(View view){
        Intent intent = new Intent(BokaActivity.this, DetailActivity.class);
        startActivity(intent);

    }

    public void todetail1(View view){
        Intent intent = new Intent(BokaActivity.this, DetailActivity.class);
        startActivity(intent);

    }

    public void tohome(View view){
        Intent intent = new Intent(BokaActivity.this, HomeActivity.class);
        startActivity(intent);

    }

    public void tokate(View view){
        Intent intent = new Intent(BokaActivity.this, DetailActivity.class);
        startActivity(intent);

    }
    public void toproduk(View view){
        Intent intent = new Intent(BokaActivity.this, DetailActivity.class);
        startActivity(intent);

    }

    public void tonotif(View view){
        Intent intent = new Intent(BokaActivity.this, NotifActivity.class);
        startActivity(intent);

    }

    public void tosetting(View view){
        Intent intent = new Intent(BokaActivity.this, SettingActivity.class);
        startActivity(intent);

    }
}