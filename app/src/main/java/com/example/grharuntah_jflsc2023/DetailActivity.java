package com.example.grharuntah_jflsc2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }

    public void tohome(View view){
        Intent intent = new Intent(DetailActivity.this, HomeActivity.class);
        startActivity(intent);

    }

    public void tocart(View view){
        Intent intent = new Intent(DetailActivity.this, ProdukActivity.class);
        startActivity(intent);

    }

    public void topay(View view){
        Intent intent = new Intent(DetailActivity.this, PaymentActivity.class);
        startActivity(intent);

    }

    public void tonotif(View view){
        Intent intent = new Intent(DetailActivity.this, NotifActivity.class);
        startActivity(intent);

    }

    public void tosetting(View view){
        Intent intent = new Intent(DetailActivity.this, SettingActivity.class);
        startActivity(intent);

    }
}