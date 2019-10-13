package com.krisaditya.projectuts.GameOfflineActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.krisaditya.projectuts.R;

public class TombRaider extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tomb_raider);

        Bundle bundle = getIntent().getExtras();
        if(bundle!= null){
            if (bundle.getString("some")!=null){
                Toast.makeText(getApplicationContext(),
                        "data"+ bundle.getString("some"),Toast.LENGTH_SHORT).show();
            }
        }
    }
}
