package com.example.yoguespet.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.yoguespet.R;

public class BienvenidaActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtRecuperar;

    Button btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);

        txtRecuperar = findViewById(R.id.OlvidasteContra);
        btnRegistrar = findViewById(R.id.CrearCuenta);

        txtRecuperar.setOnClickListener(this);
        btnRegistrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.OlvidasteContra){
            Intent iRecuperar = new Intent(this, RecuperarCuentaActivity.class);
            startActivity(iRecuperar);
            finish();
        } else if (v.getId() == R.id.CrearCuenta) {
            Intent iCrearC = new Intent(this, RegistrateActivity.class);
            startActivity(iCrearC);
            finish();
        }
    }
}