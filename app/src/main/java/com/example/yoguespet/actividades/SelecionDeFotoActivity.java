package com.example.yoguespet.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.yoguespet.R;

public class SelecionDeFotoActivity extends AppCompatActivity implements View.OnClickListener {

    Button cargaPrincipal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecion_de_foto);

        cargaPrincipal = findViewById(R.id.cargaPrincipal);
        cargaPrincipal.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.cargaPrincipal){
            avanzar();
        }
    }

    private void avanzar() {
        Intent iAvanzar = new Intent(this, CargaCreacionCuentaActivity.class);
        startActivity(iAvanzar);
        finish();
    }
}