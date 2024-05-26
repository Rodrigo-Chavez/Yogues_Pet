package com.example.yoguespet.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.yoguespet.R;

public class BienvenidaActivity extends AppCompatActivity implements View.OnClickListener {


    //nuevo
    EditText txtcorreocel, txtcontrasena;
    TextView txtRecuperar;
    
    Button btnRegistrar, btnIniciarSession;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);

        //nuevo
        txtcorreocel = findViewById(R.id.CelCorreo);
        txtcontrasena = findViewById(R.id.Contrasena);
        btnIniciarSession = findViewById(R.id.InicioSesionB);
        txtRecuperar = findViewById(R.id.OlvidasteContra);
        btnRegistrar = findViewById(R.id.CrearCuenta);

        txtRecuperar.setOnClickListener(this);
        btnRegistrar.setOnClickListener(this);
        btnIniciarSession.setOnClickListener(this);
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
        } else if (v.getId()== R.id.InicioSesionB) {
            iniciarSesion(txtcorreocel.getText().toString().trim().toLowerCase(), txtcontrasena.getText().toString());
        }
        //nuevo
    }

    private void iniciarSesion(String correo, String contrasena) {
        //sqlite
        if(correo.equals("sebas@upn.pe") && contrasena.equals("123456")){
            Intent iBienvenida = new Intent(this, InicioSesionActivity.class);
            iBienvenida.putExtra("nombre", "ositope");
            startActivity(iBienvenida);
            finish();
        }
        else{
            Toast.makeText(this, "Correo o clave incorrecta", Toast.LENGTH_SHORT).show();
        }
    }
}
