package com.example.yoguespet.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.yoguespet.R;

public class RecuperarCuentaNumActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imgVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_cuenta_num);

        imgVolver = findViewById(R.id.imgVolver);

        imgVolver.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.imgVolver){
            volver();
        }
    }

    private void volver() {
        Intent iVolver = new Intent(this, BienvenidaActivity.class);
        startActivity(iVolver);
        finish();
    }
}