package com.example.layouts1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Creamos las variables paralelas a lso objetos de la parte grafica
    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;
    private TextView txt1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Linkamos las variables a los objetos de la parte grafica
        bt1=findViewById(R.id.bt_1);
        bt2=findViewById(R.id.bt_2);
        bt3=findViewById(R.id.bt_3);
        bt4=findViewById(R.id.bt_4);
        txt1=findViewById(R.id.txt_1);

    }

    public void onClick_bt1 (View v){

        String palabra=" Has pulsado el boton 1 ";

        txt1.setText(palabra);
        txt1.setBackgroundColor(0xFF9C27B0);


    }

    public void onClick_bt2 (View v){

        String palabra=" Has pulsado el boton 2 ";

        txt1.setText(palabra);
        txt1.setBackgroundColor(0xFFFFEB3B);

    }

    public void onClick_bt3 (View v){

        String palabra=" Has pulsado el boton 3 ";

        txt1.setText(palabra);
        txt1.setBackgroundColor(0xfff00000);

    }

    public void onClick_bt4 (View v){

        String palabra=" Has pulsado el boton 4 ";

        txt1.setText(palabra);
        txt1.setBackgroundColor(0xFF00BCD4);

    }




}