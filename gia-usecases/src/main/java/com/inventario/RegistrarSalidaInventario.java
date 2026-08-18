package com.gia.usecases.inventario;

import com.gia.domain.entities.Inventario;
import com.gia.domain.repositories.InventarioRepository;

public class RegistrarSalidaInventario {
    
    private final InventarioRepository inventarioRepository;

    public RegistrarSalidaInventario(InventarioRepository inventarioRepository) {
        this.inventarioRepository = inventarioRepository;
    }

    public void execute(int inventarioId, int cantidad) {
        Inventario inv = inventarioRepository.findById(inventarioId);

        if (inv.getCantidad() < cantidad) {
            throw new IllegalArgumentException("No hay suficiente stock.");
        }

        inv.setCantidad(inv.getCantidad() - cantidad);
        inventarioRepository.update(inv);
    }
}
