package com.krisaditya.projectuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GamingGears extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaming_gears);
    }

    public void handleHeadset(View view) {
            Intent intent =  new Intent(this,Headset.class);
            startActivity(intent);
        }
}
