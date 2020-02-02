package com.example.travel_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class Lumbini extends AppCompatActivity {

    ImageView buttt;
    ImageView but1;
    ImageView but2;
    ImageView btt3;
    ImageButton msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lumbini);
        ImageSlider imageSlider=findViewById(R.id.slider);
        List<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel("https://www.nepalsanctuarytreks.com/wp-content/uploads/2018/10/lumbini.jpg"," "));
        slideModels.add(new SlideModel("https://highlandexpeditions.com/wp-content/uploads/2019/08/BRP_Lumbini_Mayadevi_temple.jpg"," "));
        slideModels.add(new SlideModel("https://www.holidify.com/images/bgImages/LUMBINI.jpg"," "));
        slideModels.add(new SlideModel("https://www.glorioushimalaya.com/wp-content/uploads/Lumbini-tours.jpg"," "));
        imageSlider.setImageList(slideModels,true);
        ImageButton but = (ImageButton) findViewById(R.id.ic_info);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Lumbini.this, Popup.class));
            }
        });
        ImageButton msg = (ImageButton) findViewById(R.id.msg);
        msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Lumbini.this, Specialities.class));
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
            public void onClick(View v)  {

            }
        });

    }



}

