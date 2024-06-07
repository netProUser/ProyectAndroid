package com.practico.startproyect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btn_ingresar);
            button.setOnClickListener(v -> {
                Toast.makeText(this,"Ingrese las credenciales",Toast.LENGTH_LONG).show();
            });
    }
}