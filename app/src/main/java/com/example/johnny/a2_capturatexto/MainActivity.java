package com.example.johnny.a2_capturatexto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNombre = (EditText) findViewById(R.id.txtNombre);
    }

    public void saludar(View view) {
        String nombre = txtNombre.getText().toString();
        Toast.makeText(getApplicationContext(),
                "Hola " + nombre + " ¿Como estas?", Toast.LENGTH_SHORT).show();
    }

}
