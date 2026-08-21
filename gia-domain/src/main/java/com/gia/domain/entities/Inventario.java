package com.gia.domain.entities;

/* Cantidad de producto en un sitio concreto del almacen */
public class Inventario {

    private final int id;

    private int productoId;

    private int ubicacionId;

    private int cantidad;

    public Inventario(int id, int productoId, int ubicacionId, int cantidad) {
        this.id = id;
        this.productoId = productoId;
        this.ubicacionId = ubicacionId;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public int getUbicacionId() {
        return ubicacionId;
    }

    public void setUbicacionId(int ubicacionId) {
        this.ubicacionId = ubicacionId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

