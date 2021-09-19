package com.example.alertdialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    Button bt01_Teste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bt01_Teste = findViewById (R.id.bt01_testeAD);
        bt01_Teste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertTeste(view);
            }
        });
    }

    private void AlertTeste (View view) {
        AlertDialog.Builder builder2 = new AlertDialog.Builder(MainActivity2.this);
        LayoutInflater inflater = this.getLayoutInflater();
        View visao = inflater.inflate(R.layout.dialog_teste, null);
        builder2.setView(visao);

        Spinner sp00_Teste = visao.findViewById (R.id.sp00_teste);
        Spinner sp01_Teste = visao.findViewById (R.id.sp01_teste);

        Button bt00_Teste = visao.findViewById (R.id.bt00_teste);
        bt00_Teste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e ("Final", "Botão 01");
                //Toast.makeText (MainActivity2.this, "Finalizar", Toast.LENGTH_LONG);
            }
        });

        Button bt01_Teste = visao.findViewById (R.id.bt01_teste);
        bt01_Teste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e ("Final", "Botão 02");
                //Toast.makeText (MainActivity2.this, "Finalizar", Toast.LENGTH_LONG);
            }
        });

        builder2.create();
        builder2.show();
    }
}