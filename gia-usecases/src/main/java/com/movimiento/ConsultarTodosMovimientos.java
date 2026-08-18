import java.util.List;

import com.gia.domain.entities.Movimiento;
import com.gia.domain.repositories.MovimientoRepository;

public class ConsultarTodosMovimientos {
    
    private final MovimientoRepository movimientoRepository;

    public ConsultarTodosMovimientos(MovimientoRepository movimientoRepository) {
        this.movimientoRepository = movimientoRepository;
    }

    public List<Movimiento> execute() {
        return movimientoRepository.findAll();
        //No recibe parámetros porque busca todos los movimientos.
    }
}
