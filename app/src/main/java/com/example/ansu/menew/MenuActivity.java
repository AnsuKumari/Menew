package com.example.ansu.menew;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

//        final TextView resMenu = findViewById(R.id.resMenu);
        final Intent i = getIntent();
//        resMenu.post(new Runnable() {
//            @Override
//            public void run() {
//                resMenu.setText(i.getStringExtra("id"));
//            }
//        });

        ImageView imageView = findViewById(R.id.menuPic);
//        String downloadUrl = "http://goo.gl/gEgYUd";
        Glide.with(this).load(i.getStringExtra("url")).into(imageView);
    }
}
