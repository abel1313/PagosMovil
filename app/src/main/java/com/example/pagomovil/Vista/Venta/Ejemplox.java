package com.example.pagomovil.Vista.Venta;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.movilventa.R;
import com.google.android.material.snackbar.Snackbar;

public class Ejemplox extends AppCompatActivity {

    private EditText info = null;
    private TextView txtV = null;
    private Button btnEjemplo = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplox);

        info = (EditText)findViewById(R.id.editTextTextPersonName);
        txtV = (TextView) findViewById(R.id.textView6);
        btnEjemplo = (Button) findViewById(R.id.btnEjemploMensaje);
        info.setText(getIntent().getStringExtra("name"));
        txtV.setText(getIntent().getStringExtra("name"));
        Snackbar mySnackbar = Snackbar.make(findViewById(R.id.myCoordinatorLayout), "Deberas cambiar", Snackbar.LENGTH_SHORT );

        btnEjemplo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mySnackbar.show();
            }
        });
    }
}