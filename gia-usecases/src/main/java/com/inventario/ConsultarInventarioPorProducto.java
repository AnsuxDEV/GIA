package com.gia.usecases.inventario;

import com.gia.domain.entities.Inventario;
import com.gia.domain.repositories.InventarioRepository;
import java.util.List;

public class ConsultarInventarioPorProducto {

    private final InventarioRepository inventarioRepository; /* Esto no puede cambiar nunca, por eso es final */

    public ConsultarInventarioPorProducto(InventarioRepository inventarioRepository) {
        this.inventarioRepository = inventarioRepository; /* Constructor que recibe el repositorio */
    }

    public List<Inventario> execute(int productoId) {
        return inventarioRepository.findByProducto(productoId); /*
                                                                 * Este es el método principal que recibe un productoId.
                                                                 * Llama al repositorio para obtener el inventario
                                                                 * asociado al producto. Al final, devuelve la lista de
                                                                 * inventarios.
                                                                 */
    }
}
