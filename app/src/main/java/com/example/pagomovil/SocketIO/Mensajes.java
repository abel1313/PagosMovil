package com.example.pagomovil.SocketIO;

import androidx.appcompat.app.AppCompatActivity;


public class Mensajes  extends AppCompatActivity {
    private String txtCantidadVenta;

    public Mensajes (String cantidad)
    {
        this.txtCantidadVenta = cantidad;
    }

    public String getTxtCantidadVenta() {
        return txtCantidadVenta;
    }

    public void setTxtCantidadVenta(String txtCantidadVenta) {
        this.txtCantidadVenta = txtCantidadVenta;
    }
}
