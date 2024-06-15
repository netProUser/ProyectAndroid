package com.practico.startproyect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.practico.startproyect.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    public static final  String CREDENCIALES_KEY = "credenciales";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle extras = getIntent().getExtras();
        CredencialesEntity credenciales = extras.getParcelable(CREDENCIALES_KEY);
        binding.txtUsuario1.setText(credenciales.getUsuario());
        binding.txtClave1.setText(credenciales.getClave());

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