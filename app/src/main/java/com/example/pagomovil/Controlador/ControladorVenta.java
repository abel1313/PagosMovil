package com.example.pagomovil.Controlador;


public class ControladorVenta
{
private String txtCardVenta;

    public ControladorVenta(String txtCardVenta)
    {
        this.txtCardVenta = txtCardVenta;
    }

    public String getTxtCardVenta() {
        return txtCardVenta;
    }

    public void setTxtCardVenta(String txtCardVenta) {
        this.txtCardVenta = txtCardVenta;
    }

}
