package com.example.ejercicio06recyclerview.modelos;

public class ListaCompra {
    private String producto;

    private String precio;
    private int cantidad;

    public ListaCompra() {
    }

    public ListaCompra(String producto, String precio, int cantidad) {
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public ListaCompra(String producto, String precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String nombre) {
        this.producto = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "ListaCompra{" +
                "producto='" + producto + '\'' +
                ", precio='" + precio + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
