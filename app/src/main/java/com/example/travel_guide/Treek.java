package com.example.travel_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Treek extends AppCompatActivity {
ImageView butt4;
Button butt5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treek);
        ImageView butt4 = (ImageView) findViewById(R.id.im1);
        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Treek.this, profile.class));
            }
        });
        Button butt5 = (Button) findViewById(R.id.button1);
        butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Treek.this, Signup.class));
            }
        });
    }
}
