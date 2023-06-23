package cl.jpvs.modulo4_ejercicio9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Button;

import android.content.Intent;

import android.view.View;

import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListeners();

    }

    private void initListeners() {
        ImageButton boton1 = findViewById(R.id.button1);
        ImageButton boton2 = findViewById(R.id.button2);
        ImageButton boton3 = findViewById(R.id.button3);
        ImageButton boton4 = findViewById(R.id.button4);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActidadTwo();
            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActidadTwo();
            }
        });
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActidadTwo();
            }
        });
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActidadTwo();
            }
        });
    }

    public void moveToSecondActidadTwo(){
        Intent intent = new Intent( MainActivity.this, SecondActivity.class);
        startActivity(intent);
            }


}