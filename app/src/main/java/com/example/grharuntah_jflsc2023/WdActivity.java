package com.example.grharuntah_jflsc2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wd);
    }

    public void tonotif(View view){
        Intent intent = new Intent(WdActivity.this, NotifActivity.class);
        startActivity(intent);

    }

    public void tosetting(View view){
        Intent intent = new Intent(WdActivity.this, SettingActivity.class);
        startActivity(intent);

    }
    public void tohome(View view){
        Intent intent = new Intent(WdActivity.this, HomeActivity.class);
        startActivity(intent);

    }

    public void toproduk(View view){
        Intent intent = new Intent(WdActivity.this, ProdukActivity.class);
        startActivity(intent);

    }
    public void tokate(View view){
        Intent intent = new Intent(WdActivity.this, KategoriActivity.class);
        startActivity(intent);

    }

    public void topay(View view){
        Intent intent = new Intent(WdActivity.this, PaymentActivity.class);
        startActivity(intent);

    }

    public void topay2(View view){
        Intent intent = new Intent(WdActivity.this, PaymentActivity.class);
        startActivity(intent);

    }

    public void topay3(View view){
        Intent intent = new Intent(WdActivity.this, PaymentActivity.class);
        startActivity(intent);

    }

    public void topay4(View view){
        Intent intent = new Intent(WdActivity.this, PaymentActivity.class);
        startActivity(intent);

    }
}