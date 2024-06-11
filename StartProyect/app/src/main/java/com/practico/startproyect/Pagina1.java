package com.practico.startproyect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.practico.startproyect.databinding.ActivityPagina1Binding;

public class Pagina1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityPagina1Binding binding = ActivityPagina1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnIngresar2.setOnClickListener(v -> {
            String v_usuario = binding.txtUsuario.getText().toString();
            String v_clave = binding.txtClave.getText().toString();
            Toast.makeText(this,getString(R.string.mensajeAdvertencia),Toast.LENGTH_LONG).show();
            openPrimeraPagina(v_usuario,v_clave);
        });

    }

    private void openPrimeraPagina(String v_usuario,String v_clave) {
        CredencialesEntity credenciales = new CredencialesEntity(v_usuario,v_clave);
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}