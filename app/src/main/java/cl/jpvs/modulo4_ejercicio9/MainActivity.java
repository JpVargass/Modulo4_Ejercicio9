package cl.jpvs.modulo4_ejercicio9;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.widget.Button;

import android.content.Intent;

import android.view.View;

import android.widget.ImageButton;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    int imagen1 = R.drawable.baseline_yard_24;
    int imagen2 = R.drawable.baseline_woman_24;
    int imagen3 = R.drawable.baseline_theater_comedy_24;
    int imagen4 = R.drawable.baseline_sick_24;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListeners();

    }

    private void initListeners() {
        ImageView boton1 = findViewById(R.id.button1);
        ImageView boton2 = findViewById(R.id.button2);
        ImageView boton3 = findViewById(R.id.button3);
        ImageView boton4 = findViewById(R.id.button4);
        Button botonSalir = findViewById(R.id.buttonExit);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActidadTwo(imagen1);
            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActidadTwo(imagen2);
            }
        });
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActidadTwo(imagen3);
            }
        });
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActidadTwo(imagen4);
            }
        });

        botonSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void moveToSecondActidadTwo(int imagen){
        Intent intent = new Intent( MainActivity.this, SecondActivity.class);
        intent.putExtra("Clave" , imagen);
        startActivity(intent);
            }

      }