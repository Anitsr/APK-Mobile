package com.example.grharuntah_jflsc2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void tocart(View view){
        Intent intent = new Intent(HomeActivity.this, ProdukActivity.class);
        startActivity(intent);

    }

    public void tokat(View view){
        Intent intent = new Intent(HomeActivity.this, KategoriActivity.class);
        startActivity(intent);

    }

    public void tonotif(View view){
        Intent intent = new Intent(HomeActivity.this, NotifActivity.class);
        startActivity(intent);

    }

    public void tosetting(View view){
        Intent intent = new Intent(HomeActivity.this, SettingActivity.class);
        startActivity(intent);

    }

    public void towd(View view){
        Intent intent = new Intent(HomeActivity.this, WdActivity.class);
        startActivity(intent);

    }
}