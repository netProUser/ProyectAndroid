package com.practico.startproyect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.practico.startproyect.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Button button = findViewById(R.id.btn_ingresar);
            binding.btnIngresar.setOnClickListener(v -> {
                Toast.makeText(this,getString(R.string.mensajeAdvertencia),Toast.LENGTH_LONG).show();
                openPrimeraPagina();
            });
    }

    private void openPrimeraPagina() {
        Intent intent = new Intent(this,Pagina1.class);
        startActivity(intent);
    }
}