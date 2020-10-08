package com.example.arraydeobjetos;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Resultado extends AppCompatActivity {
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        resultado = findViewById(R.id.textViewResultado);

        Intent proxima = getIntent();

        ArrayList<Pessoa> listaPessoas = (ArrayList<Pessoa>) proxima.getSerializableExtra("pessoas");

        String todos = new String();

        for (Pessoa p : listaPessoas){
            todos += p.toString() + "\n";
        }

        resultado.setText(todos);
    }
}