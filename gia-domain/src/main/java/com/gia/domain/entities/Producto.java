package com.gia.domain.entities;

import java.time.LocalDate;

/* cada producto almacenado en la app esta aquí */

public class Producto {

    private final int id;

    private String nombre;

    private String categoria;

    private double peso;

    private double volumen;

    private LocalDate fechaCaducidad;

    private String codigoBarras;

    public Producto(int id, String nombre, String categoria, double peso, double volumen, LocalDate fechaCaducidad, String codigoBarras) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.peso = peso;
        this.volumen = volumen;
        this.fechaCaducidad = fechaCaducidad;
        this.codigoBarras = codigoBarras;
        
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPeso() {
        return peso;
    }

    public double getVolumen() {
        return volumen;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

}
