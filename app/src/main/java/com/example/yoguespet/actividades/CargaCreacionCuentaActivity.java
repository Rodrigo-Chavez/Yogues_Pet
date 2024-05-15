package com.example.yoguespet.actividades;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yoguespet.R;

public class CargaCreacionCuentaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carga_creacion_cuenta);
        Thread tCarga = new Thread(){
            @Override
            public void run() {
                super.run();
                //en está sección se válida datos previos de la app (ej. conectividad, permisos)
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                finally {
                    //declaramos la siguiente actividad
                    Intent iSesion = new Intent(getApplicationContext(), TipoMascotaActivity.class);
                    //iniciamos la actividad
                    startActivity(iSesion);
                    //cerramos la actividad actual para no dejar historial
                    finish();
                }
            }
        };
        tCarga.start();
    }
}