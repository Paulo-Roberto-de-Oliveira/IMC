package com.example.calculandoimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText peso;
    private EditText altura;
    private Button BT_calculo;
    private TextView resultado;
    private double resultadoFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.peso = (EditText) findViewById(R.id.EDT_peso);
        this.altura = (EditText) findViewById(R.id.EDT_altura);
        this.resultado = (TextView) findViewById(R.id.txtv_resultado);
        BT_calculo = (Button) findViewById(R.id.BTN_calculo);
        BT_calculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //fazendo calculo
                double peso1 = Double.parseDouble(peso.getText().toString());
                double altura1 = Double.parseDouble(altura.getText().toString());
                resultadoFinal = peso1 / altura1;
                resultado.setText(String.format("%.2f", resultadoFinal));

            }
        });

    }
}