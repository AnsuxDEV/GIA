package com.gia.domain.repositories;

import com.gia.domain.entities.Producto;
import java.util.List;

public interface ProductoRepository {

    Producto findById(int id); /* Busca un producto en concreto */

    List<Producto> findAll(); /* Catálogo */

    void save(Producto producto); /* Crea los productos */

    void update(Producto producto); /* modifica los productos */

    void delete(int id); /* Elimina un producto */

}
