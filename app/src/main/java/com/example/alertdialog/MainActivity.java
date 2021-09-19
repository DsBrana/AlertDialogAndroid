package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btTeste_AD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btTeste_AD = findViewById (R.id.bt_testeAD);
        btTeste_AD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertTeste(view);

            }
        });
    }

    private void AlertTeste (View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle ("Teste de Alert Dialog");
        builder.setMessage ("Olá, bem feito este teste, parabéns");
                builder.setPositiveButton("+", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Positivo", Toast.LENGTH_LONG).show();
                    }
                });
                builder.setNegativeButton("-", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Negativo", Toast.LENGTH_LONG).show();
                    }
                });
                builder.create();
                builder.show();
    }
}