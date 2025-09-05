package com.example.primerapp;

import android.graphics.Color;
import android.os.Bundle;

import android.util.Log;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Log.i("Testing","Probando Mensajes");

//        creo un linear
//        el contexto es this, ya que esta dentro del activity
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL); // LE CAMBIO LA HORIENTACION
        linearLayout.setPadding(0, 100, 0, 0);
        linearLayout.setBackgroundColor(Color.YELLOW);

        TextView textV = new TextView(this);
        textV.setText(R.string.welcome_message); // ASIGNO EL NOMBRE
        textV.setBackgroundColor(Color.parseColor("#FF5733")); // ASIGNO COLOR DE FONDO
        textV.setGravity(Gravity.CENTER);  // CENTRO EL TEXTO

        linearLayout.addView(textV);
        Button button = new Button(this);
        button.setText(R.string.button_message);

        linearLayout.addView(button);

        setContentView(linearLayout); // SETEO EL LAYOUT
        }

//        Button btnIniciar = findViewById(R.id.btnIniciar);
//
//        btnIniciar.setOnClickListener(v ->
//                Toast.makeText(this, "¡Arrancamos!", Toast.LENGTH_SHORT).show()
//        );
    }
