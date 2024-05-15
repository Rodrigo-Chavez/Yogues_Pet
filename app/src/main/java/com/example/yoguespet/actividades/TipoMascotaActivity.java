package com.example.yoguespet.actividades;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yoguespet.R;

public class TipoMascotaActivity extends AppCompatActivity implements View.OnClickListener{

    Button siguiente;
    TextView saltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_mascota);

        siguiente = findViewById(R.id.btnSiguiente);
        siguiente.setOnClickListener(this);

        saltar = findViewById(R.id.txtSaltar);
        saltar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnSiguiente){
            expeMascota();
        }
        else if(v.getId() == R.id.txtSaltar){
            expeMascota();
        }
    }

    private void expeMascota() {
        Intent iexpoMascota = new Intent(this, NivelExperienciaActivity.class);
        startActivity(iexpoMascota);
        finish();
    }
}