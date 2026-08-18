package com.gia.domain.repositories;

import java.util.List;
import com.gia.domain.entities.Movimiento;

public interface MovimientoRepository {
    
    Movimiento findById(int id);

    List<Movimiento> findAll();

    List<Movimiento> findByProducto(int productoId);

    List<Movimiento> findByUsuario(int usuarioId);

    void save(Movimiento movimiento); /* No necesito borrar ni modificar porque es un histórico */
    
}
