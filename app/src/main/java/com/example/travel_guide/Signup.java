package com.example.travel_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Signup extends AppCompatActivity {
  Button butttt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Button butttt = (Button) findViewById(R.id.button10);
        butttt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(Signup.this,"Thankyou for uploading we will reach out soon!", Toast.LENGTH_LONG).show();
            }
        });
    }

}
