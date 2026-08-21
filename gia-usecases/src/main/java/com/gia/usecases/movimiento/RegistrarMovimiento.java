package com.gia.usecases.movimiento;

import com.gia.domain.entities.Movimiento;
import com.gia.domain.repositories.MovimientoRepository;

public class RegistrarMovimiento {
    private final MovimientoRepository movimientoRepository;

    public RegistrarMovimiento(MovimientoRepository movimientoRepository) {
        this.movimientoRepository = movimientoRepository;
    }

    public void execute(Movimiento movimiento) {
        movimientoRepository.save(movimiento);
    }
}
