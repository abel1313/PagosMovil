package com.example.pagomovil.Modelo;

public class Producto
{
    private int idProducto;
    private String nombreProducto;
    private String descripcionProducto;
    private double precioProducto;
    private double existencia_Producto;


    public Producto()
    {
        this.idProducto = 0;
        this.nombreProducto = "";
        this.descripcionProducto = "";
        this.precioProducto = 0;
        this.existencia_Producto = 0;
    }

    public Producto(int idProducto, String nombreProducto, String descripcionProducto,
                    double precioProducto, double existencia_Producto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.precioProducto = precioProducto;
        this.existencia_Producto = existencia_Producto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public double getExistencia_Producto() {
        return existencia_Producto;
    }

    public void setExistencia_Producto(double existencia_Producto) {
        this.existencia_Producto = existencia_Producto;
    }
}
