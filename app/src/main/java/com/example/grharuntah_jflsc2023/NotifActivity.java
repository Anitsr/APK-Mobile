package com.example.grharuntah_jflsc2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NotifActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notif);
    }

    public void tonotif(View view){
        Intent intent = new Intent(NotifActivity.this, NotifActivity.class);
        startActivity(intent);

    }

    public void tosetting(View view){
        Intent intent = new Intent(NotifActivity.this, SettingActivity.class);
        startActivity(intent);

    }
    public void tohome(View view){
        Intent intent = new Intent(NotifActivity.this, HomeActivity.class);
        startActivity(intent);

    }

    public void toproduk(View view){
        Intent intent = new Intent(NotifActivity.this, ProdukActivity.class);
        startActivity(intent);

    }
    public void tokate(View view){
        Intent intent = new Intent(NotifActivity.this, KategoriActivity.class);
        startActivity(intent);

    }
}