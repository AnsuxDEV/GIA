package com.gia.domain.entities;

import java.time.LocalDateTime;

public class Movimiento {
    
    public enum TipoMovimiento {

        ENTRADA,
        SALIDA,
        REUBICACION
    }

    private final int id;
    private TipoMovimiento tipo;
    private  int productoId;
    private int cantidad;
    private LocalDateTime fecha;
    private int usuarioId;
    private Integer ubicacionOrigenId;  /*Estos dos pueden ser null */
    private Integer ubicacionDestinoId;

    public Movimiento(int id, TipoMovimiento tipo, int productoId, int cantidad, LocalDateTime fecha, int usuarioId, Integer ubicacionOrigenId, Integer ubicacionDestinoId) {
        this.id = id;
        this.tipo = tipo;
        this.productoId = productoId;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.usuarioId = usuarioId;
        this.ubicacionOrigenId = ubicacionOrigenId;
        this.ubicacionDestinoId = ubicacionDestinoId;
    }

    public int getId() {
        return id;
    }

    public TipoMovimiento getTipo() {
        return tipo;
    }

    public int getProductoId() {
        return productoId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public Integer getUbicacionOrigenId() {
        return ubicacionOrigenId;
    }

    public Integer getUbicacionDestinoId() {
        return ubicacionDestinoId;
    }

}
