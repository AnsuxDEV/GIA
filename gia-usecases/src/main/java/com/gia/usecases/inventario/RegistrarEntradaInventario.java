package com.gia.usecases.inventario;

import com.gia.domain.entities.Inventario;
import com.gia.domain.repositories.InventarioRepository;

public class RegistrarEntradaInventario {
    
    private final InventarioRepository inventarioRepository;

    public RegistrarEntradaInventario(InventarioRepository inventarioRepository) {
        this.inventarioRepository = inventarioRepository;
    }

    public void execute(int inventarioId, int cantidad) {
        Inventario inv = inventarioRepository.findById(inventarioId);
        inv.setCantidad(inv.getCantidad() + cantidad);
        inventarioRepository.update(inv);
    }
}
