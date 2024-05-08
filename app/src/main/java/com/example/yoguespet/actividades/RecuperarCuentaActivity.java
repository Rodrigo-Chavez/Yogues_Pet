package com.example.yoguespet.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yoguespet.R;

public class RecuperarCuentaActivity extends AppCompatActivity implements View.OnClickListener{

    TextView txtRecuperarnum;
    ImageView imgVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_cuenta);

        txtRecuperarnum = findViewById(R.id.RecuperarConNum);
        imgVolver = findViewById(R.id.imgVolver);
        
        txtRecuperarnum.setOnClickListener(this);
        imgVolver.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.RecuperarConNum){
            recuperarCuentaNum();
        } else if (v.getId() == R.id.imgVolver) {
            volver();
        }
    }

    private void volver() {
        Intent iVolver = new Intent(this, BienvenidaActivity.class);
        startActivity(iVolver);
        finish();
    }

    private void recuperarCuentaNum() {
        Intent iRecuperarNum = new Intent(this, RecuperarCuentaNumActivity.class);
        startActivity(iRecuperarNum);
        finish();
    }
}