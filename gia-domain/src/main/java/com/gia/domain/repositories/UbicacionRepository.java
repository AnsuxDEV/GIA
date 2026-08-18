package com.gia.domain.repositories;

import java.util.List;
import com.gia.domain.entities.Ubicacion;

public interface UbicacionRepository {

    Ubicacion findById(int id);

    List<Ubicacion> findAll();

    void save(Ubicacion ubicacion);

    void update(Ubicacion ubicacion);

    void delete(int id);

}
