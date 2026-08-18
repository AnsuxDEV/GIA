package com.gia.usecases.movimiento;

import java.util.List;
import com.gia.domain.entities.Movimiento;
import com.gia.domain.repositories.MovimientoRepository;

public class ConsultarMovimientoPorProducto {
    
    private final MovimientoRepository movimientoRepository;

    public ConsultarMovimientoPorProducto(MovimientoRepository movimientoRepository) {
        this.movimientoRepository = movimientoRepository;
    }

    public List<Movimiento> execute(int productoId) { 
        return movimientoRepository.findByProducto(productoId);
        //Este es el método principal. Recibe el ID del producto y obtiene todos los movimientos de ese producto desde el repositorio. Despues devuelve la lista.
    }

}
