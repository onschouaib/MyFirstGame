package com.dam.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    Button btnPlusouMoins, btnMorpion;

    private  void initUI(){
        btnPlusouMoins = findViewById(R.id.btnPlusouMoins);
        btnMorpion = findViewById(R.id.btnMorpion);

        //Creer une nouvelle interface avec deux bouttons qui faire l'appele a des autres interfaces
        // btnPlusouMoins.setOnClickListener(new View.OnClickListener() //pour ajouter un evenement sur un boutton
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initUI();

        btnPlusouMoins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, PlusOuMoins.class);

                String  titre = btnPlusouMoins.getText().toString();

                intent.putExtra("TitrePage", titre);

                startActivity(intent);

            }
        });

        btnMorpion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Morpion.class );
                String titreMorpion = btnMorpion.getText().toString();
                intent.putExtra("TitreMorpion", titreMorpion);
                startActivity(intent);
            }
        });
    }
}