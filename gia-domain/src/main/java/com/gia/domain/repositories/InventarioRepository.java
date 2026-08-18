package com.gia.domain.repositories;

import java.util.List;
import com.gia.domain.entities.Inventario;

public interface InventarioRepository {
    
    Inventario findById(int id);

    List<Inventario> findByProducto(int productoId);
    List<Inventario> findByUbicacion(int ubicacionId);

    void save(Inventario inventario);

    void update(Inventario inventario);

    void delete(int id);

}
