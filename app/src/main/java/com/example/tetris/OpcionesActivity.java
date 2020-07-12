package com.example.tetris;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class OpcionesActivity extends AppCompatActivity {
    private TextView tvCuadrado;
    private TextView tvZ;
    private TextView tvI;
    private TextView tvT;
    private TextView tvS;
    private TextView tvL;
    private TextView tvJ;
    private Spinner sCuadrado;
    private Spinner sZ;
    private Spinner sI;
    private Spinner sT;
    private Spinner sS;
    private Spinner sL;
    private Spinner sJ;
    private Button atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        atras = (Button)findViewById(R.id.button_atras);
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OpcionesActivity.this,Inicio.class);
                startActivity(intent);
            }
        });

        tvCuadrado = (TextView) findViewById(R.id.textView_CuadradoText);
        tvZ = (TextView) findViewById(R.id.textView_ZText);
        tvI = (TextView) findViewById(R.id.textView_IText);
        tvT = (TextView) findViewById(R.id.textView_TText);
        tvS = (TextView) findViewById(R.id.textView_SText);
        tvL = (TextView) findViewById(R.id.textView_LText);
        tvJ = (TextView) findViewById(R.id.textView_JText);

        sCuadrado = (Spinner) findViewById(R.id.spinnerCuadrado);
        sZ = (Spinner) findViewById(R.id.spinnerZPieza);
        sI = (Spinner) findViewById(R.id.spinnerIPieza);
        sT = (Spinner) findViewById(R.id.spinnerTPieza);
        sS = (Spinner) findViewById(R.id.spinnerSPieza);
        sL = (Spinner) findViewById(R.id.spinnerLPieza);
        sJ = (Spinner) findViewById(R.id.spinnerJPieza);

        String[] opciones = {"Pink", "Light Blue", "Dark Blue", "Green", "Orange", "Yellow", "Red"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);

        sCuadrado.setAdapter(adapter);
        sZ.setAdapter(adapter);
        sI.setAdapter(adapter);
        sT.setAdapter(adapter);
        sS.setAdapter(adapter);
        sL.setAdapter(adapter);
        sJ.setAdapter(adapter);
    }


    public void SetColor(View view) {                            //id:4 = verde, id:6 = amarillo, id:5 = naranja, id: 2 = azul claro, id:1 = rosa, id:3 = azul oscuro, id:7 = rojo
        // Cuadrado
        Tablero.setColorCuadrado(sCuadrado.getSelectedItemPosition() + 1);

        // Z Pieza
        Tablero.setColorZPieza(sZ.getSelectedItemPosition() + 1);

        // I Pieza
        Tablero.setColorIPieza(sI.getSelectedItemPosition() + 1);

        // T Pieza
        Tablero.setColorTPieza(sT.getSelectedItemPosition() + 1);

        // S Pieza
        Tablero.setColorSPieza(sS.getSelectedItemPosition() + 1);
        
        // L Pieza
        Tablero.setColorLPieza(sL.getSelectedItemPosition() + 1);

        // J Pieza
        Tablero.setColorJPieza(sJ.getSelectedItemPosition() + 1);
    }

}