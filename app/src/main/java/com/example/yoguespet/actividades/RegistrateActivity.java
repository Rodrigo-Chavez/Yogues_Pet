package com.example.yoguespet.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.yoguespet.R;

public class RegistrateActivity extends AppCompatActivity implements View.OnClickListener{

    private Button Hombre, Mujer, Otro;
    Button subirFoto;
    ImageView imgVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrate);

        //Volver al inicio
        imgVolver = findViewById(R.id.imgVolver);
        imgVolver.setOnClickListener(this);

        //Ir a pestaña carga de imagen
        subirFoto = findViewById(R.id.subirFoto);
        subirFoto.setOnClickListener(this);

        Hombre = findViewById(R.id.Hombre);
        Mujer = findViewById(R.id.Mujer);
        Otro = findViewById(R.id.Otro);

        Hombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hombre.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
                Mujer.setBackgroundTintList(ColorStateList.valueOf(Color.rgb(255,128,0)));
                Otro.setBackgroundTintList(ColorStateList.valueOf(Color.rgb(255,128,0)));
            }
        });

        Mujer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mujer.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
                Hombre.setBackgroundTintList(ColorStateList.valueOf(Color.rgb(255,128,0)));
                Otro.setBackgroundTintList(ColorStateList.valueOf(Color.rgb(255,128,0)));
            }
        });

        Otro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Otro.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
                Mujer.setBackgroundTintList(ColorStateList.valueOf(Color.rgb(255,128,0)));
                Hombre.setBackgroundTintList(ColorStateList.valueOf(Color.rgb(255,128,0)));
            }
        });
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imgVolver) {
            volver();
        }
        else if(v.getId() == R.id.subirFoto){
            irFoto();
        }
    }

    private void irFoto() {
        Intent iFoto = new Intent(this, SelecionDeFotoActivity.class);
        startActivity(iFoto);
        finish();
    }

    private void volver() {
        Intent iVolver = new Intent(this, BienvenidaActivity.class);
        startActivity(iVolver);
        finish();
    }
}