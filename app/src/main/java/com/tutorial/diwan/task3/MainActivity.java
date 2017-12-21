package com.tutorial.diwan.task3;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //variabel
    EditText input_panjang_alas;
    EditText input_tinggi_alas;
    EditText input_tinggi_prisma;
    Button button_hitung;
    TextView hasil;

    double panjang_alas;
    double tinggi_alas;
    double tinggi_prisma;

    //hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_panjang_alas = findViewById(R.id.input_panjang_alas);
        input_tinggi_alas = findViewById(R.id.input_tinggi_alas);
        input_tinggi_prisma = findViewById(R.id.input_tinggi_prisma);
        button_hitung = findViewById(R.id.button_hitung);
        hasil = findViewById(R.id.hasil);

        button_hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Volume();
            }
        });
    }

    public void Volume() {
        if (input_panjang_alas.getText().toString(). isEmpty()) {
            Toast.makeText(this,"Jangan lupa input panjang alasnya", Toast.LENGTH_LONG).show();
        }
        if (input_tinggi_alas.getText().toString(). isEmpty()) {
            Toast.makeText(this,"Jangan lupa input tinggi alasnya", Toast.LENGTH_LONG).show();
        }
        if (input_tinggi_prisma.getText().toString().isEmpty()) {
            Toast.makeText(this,"Jangan lupa input tinggi prismanya", Toast.LENGTH_LONG).show();
        }
        try {
            panjang_alas = Double.parseDouble(input_panjang_alas.getText().toString());
        } catch (Exception e) {
        }
        try {
            tinggi_alas = Double.parseDouble(input_tinggi_alas.getText().toString());
        } catch (Exception e) {
        }
        try {
            tinggi_prisma = Double.parseDouble(input_tinggi_prisma.getText().toString());
        } catch (Exception e) {
        }

        double result = (panjang_alas*tinggi_alas/2)*tinggi_prisma;
        hasil.setText(" Volume = "+String.valueOf(result));
    }


}