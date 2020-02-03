package com.example.travel_guide;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.speech.tts.TextToSpeech.OnInitListener;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Lumbini extends AppCompatActivity implements OnInitListener {
    private TextToSpeech repeatTTS;
    ImageView buttt;
    ImageView but1;
    ImageView but2;
    ImageView btt3;
    ImageButton msg;
    ImageButton btt4;
    ImageButton btt5;
    ImageButton btt6;
    ImageButton but7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        repeatTTS = new TextToSpeech(this, this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lumbini);
        ImageSlider imageSlider = findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://www.nepalsanctuarytreks.com/wp-content/uploads/2018/10/lumbini.jpg", " "));
        slideModels.add(new SlideModel("https://highlandexpeditions.com/wp-content/uploads/2019/08/BRP_Lumbini_Mayadevi_temple.jpg", " "));
        slideModels.add(new SlideModel("https://www.holidify.com/images/bgImages/LUMBINI.jpg", " "));
        slideModels.add(new SlideModel("https://www.glorioushimalaya.com/wp-content/uploads/Lumbini-tours.jpg", " "));

        imageSlider.setImageList(slideModels, true);
        ImageButton but = (ImageButton) findViewById(R.id.ic_info);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Lumbini.this, Popup.class));
            }
        });

        ImageView buttt = (ImageView) findViewById(R.id.hutel);

        buttt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.oyorooms.com/np/"));
                startActivity(viewIntent);
            }
        });
        ImageView but1 = (ImageView) findViewById(R.id.plen);

        but1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.buddhaair.com/"));
                startActivity(viewIntent);
            }
        });
        ImageView but2 = (ImageView) findViewById(R.id.bbuuss);

        but2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("http://bussewa.com/"));
                startActivity(viewIntent);
            }
        });
        ImageView but3 = (ImageView) findViewById(R.id.lb);

        but3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                new AlertDialog.Builder(Lumbini.this)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .setTitle("Destiny Confirmation")
                        .setMessage("Are you sure you want to go to Lumbini?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(Lumbini.this, localride.class));
                            }

                        })
                        .setNegativeButton("No", null)
                        .show();
            }
        });
        ImageView butt4 = (ImageView) findViewById(R.id.lb1);
        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Lumbini.this, Specialities.class));
            }
        });
        ImageView butt5 = (ImageView) findViewById(R.id.lb2);
        butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Lumbini.this, Treek.class));
            }
        });
        ImageButton butt6 = (ImageButton) findViewById(R.id.ic_info);
        butt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Lumbini.this, Popup.class));
            }
        });

        ImageButton but7 = (ImageButton) findViewById(R.id.speaker);
        but7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                        repeatTTS.speak("Lumbini is a Buddhist pilgrimage site in the Rupandehi District of Province No. 5 in Nepal. It is the place where, according to Buddhist tradition, Queen Mahamayadevi gave birth to Siddhartha Gautama in 563 BCE",
                                TextToSpeech.QUEUE_FLUSH, null);



            }
        });
    }
public void dem(){
    TextToSpeech tts = new TextToSpeech(this, (TextToSpeech.OnInitListener) this);
    tts.setLanguage(Locale.UK);
    tts.speak("Text to say aloud", TextToSpeech.QUEUE_ADD, null);
}

    @Override
    public void onInit(int status) {

    }
}



