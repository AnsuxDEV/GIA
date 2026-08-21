package com.gia.usecases.inventario;

import com.gia.domain.entities.Inventario;
import com.gia.domain.repositories.InventarioRepository;

public class ReubicarInventario {
    
    private final InventarioRepository inventarioRepository;

    public ReubicarInventario(InventarioRepository inventarioRepository) {
        this.inventarioRepository = inventarioRepository;
    }

    public void execute(int inventarioId, int nuevaUbicacionId) {
        Inventario inv = inventarioRepository.findById(inventarioId);
        inv.setUbicacionId(nuevaUbicacionId);
        inventarioRepository.update(inv);
    }
}
