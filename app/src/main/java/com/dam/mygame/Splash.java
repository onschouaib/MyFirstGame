package com.dam.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Déclaration de l'objet ImageView
        ImageView imageView = findViewById(R.id.imageView4);

        imageView.animate() //Lance l'animation de l'objet
                .alpha(1) //Transparence
                .rotation(3600)//Rotation
                .setDuration(3000)
                .withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(Splash.this, Home.class));
                    }
                })
                .start();

    }
}