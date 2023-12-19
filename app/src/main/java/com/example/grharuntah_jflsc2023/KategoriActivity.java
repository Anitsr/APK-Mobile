package com.example.grharuntah_jflsc2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KategoriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);
    }

    public void tohome(View view){
        Intent intent = new Intent(KategoriActivity.this, HomeActivity.class);
        startActivity(intent);

    }

    public void tocart(View view){
        Intent intent = new Intent(KategoriActivity.this, ProdukActivity.class);
        startActivity(intent);

    }

    public void tokertas(View view){
        Intent intent = new Intent(KategoriActivity.this, KertasActivity.class);
        startActivity(intent);

    }

    public void toplastik(View view){
        Intent intent = new Intent(KategoriActivity.this, PlastikActivity.class);
        startActivity(intent);

    }

    public void tologam(View view){
        Intent intent = new Intent(KategoriActivity.this, LogamActivity.class);
        startActivity(intent);

    }

    public void toorganik(View view){
        Intent intent = new Intent(KategoriActivity.this, OrganikActivity.class);
        startActivity(intent);

    }

    public void toboka(View view){
        Intent intent = new Intent(KategoriActivity.this, BokaActivity.class);
        startActivity(intent);

    }

    public void tonotif(View view){
        Intent intent = new Intent(KategoriActivity.this, NotifActivity.class);
        startActivity(intent);

    }

    public void tosetting(View view){
        Intent intent = new Intent(KategoriActivity.this, SettingActivity.class);
        startActivity(intent);

    }
}