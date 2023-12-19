package com.example.grharuntah_jflsc2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Plastik2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plastik2);
    }

    public void tonotif(View view){
        Intent intent = new Intent(Plastik2Activity.this, NotifActivity.class);
        startActivity(intent);

    }

    public void tosetting(View view){
        Intent intent = new Intent(Plastik2Activity.this, SettingActivity.class);
        startActivity(intent);

    }
    public void tohome(View view){
        Intent intent = new Intent(Plastik2Activity.this, HomeActivity.class);
        startActivity(intent);

    }

    public void toproduk(View view){
        Intent intent = new Intent(Plastik2Activity.this, ProdukActivity.class);
        startActivity(intent);

    }
    public void tokate(View view){
        Intent intent = new Intent(Plastik2Activity.this, KategoriActivity.class);
        startActivity(intent);

    }

    public void todetail(View view){
        Intent intent = new Intent(Plastik2Activity.this, DetailActivity.class);
        startActivity(intent);

    }

    public void topref(View view){
        Intent intent = new Intent(Plastik2Activity.this, PlastikActivity.class);
        startActivity(intent);

    }
}