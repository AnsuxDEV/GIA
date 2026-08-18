package com.gia.usecases.movimiento;

import com.gia.domain.entities.movimiento; // Esta es la importación de los que vamos a guardar
import com.gia.domain.repositories.MovimientoRepository; // Esta es la impoirtación en donde vamos a guardar


public class RegistrarMovimiento { //Esta es la clase que va a registrar la acción "Registrar un movimiento"
    private final MovimientoRepository movimientoRepository; // Este es el repositorio para guardar los movimientos. El final significa que no cambia cuando esté asignado.

    public RegistrarMovimiento(MovimientoRepository movimientoRepository) {
        this.movimientoRepository = movimientoRepository;
    }

    public void execute(Movimiento movimiento) { //Método principal. Recibe "Movimiento" y lo guarda en el repositorio movimientoRepository.
        movimientoRepository.save(movimiento);
    }
}
