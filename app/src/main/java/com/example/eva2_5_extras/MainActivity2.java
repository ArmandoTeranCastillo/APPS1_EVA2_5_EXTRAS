package com.example.eva2_5_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        intent = getIntent();
        intent.getStringExtra("Nombre");
        String sNom = intent.getStringExtra("Nombre");
        Double dSal = intent.getDoubleExtra("Salario",0.0);
        boolean bInfo = intent.getBooleanExtra("Info",false);
        int iEstado = intent.getIntExtra("Estado Civil",0);
        TextView txtVwDatos;
        txtVwDatos = findViewById(R.id.txtVwDatos);
        txtVwDatos.append("Nombre: \n" );
        txtVwDatos.append(sNom +"\n" );
        txtVwDatos.append("Salario: \n" );
        txtVwDatos.append(dSal +"\n" );
        txtVwDatos.append("Informacion: \n" );
        if(bInfo)
            txtVwDatos.append("Con informacion \n");
        else
            txtVwDatos.append("Sin informacion \n");

        txtVwDatos.append("Estado Civil: \n");
        txtVwDatos.append(iEstado + "\n");
    }
    public void onClickSal(View v){
        finish();
    }
}