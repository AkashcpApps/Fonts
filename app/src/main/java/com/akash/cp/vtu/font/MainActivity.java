package com.akash.cp.vtu.font;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CustomFont t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(CustomFont)findViewById(R.id.t1);
        t1.setCustomFont(MainActivity.this,"arbutus.ttf");
        t2=(CustomFont)findViewById(R.id.t2);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "T1", Toast.LENGTH_SHORT).show();
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "T2", Toast.LENGTH_SHORT).show();
            }
        });

    }
}