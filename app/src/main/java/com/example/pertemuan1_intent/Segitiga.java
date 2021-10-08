package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        final EditText alas = (EditText)findViewById(R.id.input_alas);
        final EditText tinggi = (EditText)findViewById(R.id.input_tinggi);

        final TextView hasil = (TextView)findViewById(R.id.output_hasil);

        final Button tampil = (Button)findViewById(R.id.btn_hitung);

        tampil.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
                String isialas = alas.getText().toString();
                String isitinggi = tinggi.getText().toString();
                double a = Double.parseDouble(isialas);
                double t = Double.parseDouble(isitinggi);
                double hs = LuasSegitiga(a,t);
                String output = String.valueOf(hs);
                hasil.setText(output.toString());
        }
    });
    }
    public double LuasSegitiga(double a, double t){return a*t/2;};
}