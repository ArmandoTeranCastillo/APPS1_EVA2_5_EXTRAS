package com.example.eva2_5_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    EditText edtNom, edtTxtSal;
    CheckBox chkBxInfo;
    //RadioButton rdBtnSol, rdBtnCas, rdBtnDiv, rdBtnEtc;
    RadioGroup rdGpEstado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(this, MainActivity2.class);
    }

    public void onStart(){
        super.onStart();
        edtNom = findViewById(R.id.edtTxtNombre);
        edtTxtSal = findViewById(R.id.edtTxtSalario);
        chkBxInfo = findViewById(R.id.checkBox);
        rdGpEstado = findViewById(R.id.rdGrpEstado);
        /*rdBtnCas = findViewById(R.id.rdBtnCas);
        rdBtnDiv = findViewById(R.id.rdBtnDiv);
        rdBtnSol = findViewById(R.id.rdBtnSol);
        rdBtnEtc = findViewById(R.id.rdBtnSin);*/
    }

    public void onClick(View v){
        intent.putExtra("Nombre", edtNom.getText().toString());
        Double dSalario = 0.0;
        dSalario = Double.parseDouble(edtTxtSal.getText().toString());
        intent.putExtra("Salario", dSalario);
        intent.putExtra("Info", chkBxInfo.isChecked());
        intent.putExtra("Estado Civil", rdGpEstado.getCheckedRadioButtonId());
        startActivity(intent);
    }
}