package com.dam.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class Morpion extends AppCompatActivity {

    int activePlayer = 1;

    private static final String TAG = "Morpion";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morpion);
        Intent intent = getIntent();
        String titre = intent.getStringExtra("TitreMorpion");
        setTitle(titre);
    }

    public void dropIn(View view){
        ImageView jeton = (ImageView) view;
        Log.i(TAG, jeton.getTag().toString());

        jeton.setTranslationY(-1000);

        if(activePlayer == 1) {
            jeton.setImageResource(R.drawable.star_wars);
            activePlayer = 2;
        }else
        {
            jeton.setImageResource(R.drawable.star_trek);
            activePlayer= 1;
        }

        jeton.animate()
                .translationYBy(1000)
                .rotation(1800)
                .setDuration(500);
    }
}