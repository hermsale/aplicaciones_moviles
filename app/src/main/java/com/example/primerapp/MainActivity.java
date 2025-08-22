package com.example.primerapp;

import android.os.Bundle;

import android.util.Log;
import android.widget.Button;
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

//        Esto ajusta los margenes con la barra de estado y navegacion
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            Log.d("saludo!","Corriendo log");
            return insets;
        });

        Button btnIniciar = findViewById(R.id.btnIniciar);

        btnIniciar.setOnClickListener(v ->
                Toast.makeText(this, "¡Arrancamos!", Toast.LENGTH_SHORT).show()
        );
    }
}