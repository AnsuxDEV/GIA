import java.util.List;

import com.gia.domain.entities.Movimiento;
import com.gia.domain.repositories.MovimientoRepository;

public class ConsultarMovimientoPorUsuario {

    private final MovimientoRepository movimientoRepository;

    public ConsultarMovimientoPorUsuario(MovimientoRepository movimientoRepository) {
        this.movimientoRepository = movimientoRepository;
    }

    public List<Movimiento> execute(int usuarioId) {
        return movimientoRepository.findByUsuario(usuarioId);
        //Recibe el ID del usuario, llama al repositorio y obtiene los movimientos del usuario. Devuelve una lista.
    }
    
}
