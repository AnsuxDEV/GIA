package com.gia.domain.entities;

/* Esto es el sitio fisico dentro del almacen */

public class Ubicacion {

    private final int id;

    private String pasillo;

    private String estanteria;

    private int nivel;

    private double capacidadVolumen;

    private double capacidadPeso;

    public Ubicacion (int id, String pasillo, String estanteria, int nivel, double capacidadVolumen, double capacidadPeso) {
        
        this.id = id;
        this.pasillo = pasillo;
        this.estanteria = estanteria;
        this.nivel = nivel;
        this.capacidadVolumen = capacidadVolumen;
        this.capacidadPeso = capacidadPeso;

    }
    public int getId() {
        return id;
    }
    public String getPasillo() {
        return pasillo;
    }

    public String getEstanteria() {
        return estanteria;
    }

    public int getNivel() {
        return nivel;
    }

    public double getCapacidadVolumen() {
        return capacidadVolumen;
    }

    public double getCapacidadPeso() {
        return capacidadPeso;
    }

}
