package com.example.grharuntah_jflsc2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PlastikActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plastik);
    }

    public void tonotif(View view){
        Intent intent = new Intent(PlastikActivity.this, NotifActivity.class);
        startActivity(intent);

    }

    public void tosetting(View view){
        Intent intent = new Intent(PlastikActivity.this, SettingActivity.class);
        startActivity(intent);

    }
    public void tohome(View view){
        Intent intent = new Intent(PlastikActivity.this, HomeActivity.class);
        startActivity(intent);

    }

    public void toproduk(View view){
        Intent intent = new Intent(PlastikActivity.this, ProdukActivity.class);
        startActivity(intent);

    }
    public void tokate(View view){
        Intent intent = new Intent(PlastikActivity.this, KategoriActivity.class);
        startActivity(intent);

    }

    public void todetail(View view){
        Intent intent = new Intent(PlastikActivity.this, DetailActivity.class);
        startActivity(intent);

    }

    public void todetail2(View view){
        Intent intent = new Intent(PlastikActivity.this, DetailActivity.class);
        startActivity(intent);

    }

    public void todetail3(View view){
        Intent intent = new Intent(PlastikActivity.this, DetailActivity.class);
        startActivity(intent);

    }

    public void todetail4(View view){
        Intent intent = new Intent(PlastikActivity.this, DetailActivity.class);
        startActivity(intent);

    }

    public void todetail5(View view){
        Intent intent = new Intent(PlastikActivity.this, DetailActivity.class);
        startActivity(intent);

    }

    public void todetail6(View view){
        Intent intent = new Intent(PlastikActivity.this, DetailActivity.class);
        startActivity(intent);

    }

    public void tonext(View view){
        Intent intent = new Intent(PlastikActivity.this, Plastik2Activity.class);
        startActivity(intent);

    }
}