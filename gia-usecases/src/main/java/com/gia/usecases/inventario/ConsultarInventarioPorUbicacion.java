package com.gia.usecases.inventario;

import java.util.List;

import com.gia.domain.entities.Inventario;
import com.gia.domain.repositories.InventarioRepository;

public class ConsultarInventarioPorUbicacion {
    private final InventarioRepository inventarioRepository;

    public ConsultarInventarioPorUbicacion(InventarioRepository inventarioRepository) {
        this.inventarioRepository = inventarioRepository;
    }

    public List<Inventario> execute(int ubicacionId) {
        return inventarioRepository.findByUbicacion(ubicacionId);
    }
}
