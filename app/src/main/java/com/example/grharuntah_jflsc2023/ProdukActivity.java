package com.example.grharuntah_jflsc2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProdukActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produk);
    }

    public void tohome(View view){
        Intent intent = new Intent(ProdukActivity.this, HomeActivity.class);
        startActivity(intent);

    }

    public void tokat(View view){
        Intent intent = new Intent(ProdukActivity.this, KategoriActivity.class);
        startActivity(intent);

    }

    public void tosetting(View view){
        Intent intent = new Intent(ProdukActivity.this, SettingActivity.class);
        startActivity(intent);

    }

    public void tonotif(View view){
        Intent intent = new Intent(ProdukActivity.this, NotifActivity.class);
        startActivity(intent);

    }
}