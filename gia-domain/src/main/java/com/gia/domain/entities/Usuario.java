package com.gia.domain.entities;

/* Representa a los usuarios dentro del sistema de GIA */

public class Usuario {
    
    public enum Rol {
        OPERARIO,
        SUPERVISOR,
        ADMIN
    }

    private final int id;
    private String nombre;
    private Rol rol;

    public Usuario(int id, String nombre, Rol rol) {
        this.id = id;
        this.nombre = nombre;
        this.rol = rol;

    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Rol getRol() {
        return rol;
    }

}