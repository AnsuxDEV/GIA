package com.gia.usecases.producto;

import com.gia.domain.entities.Producto;
import com.gia.domain.repositories.ProductoRepository;

public class ConsultarProductoPorId {
    private final ProductoRepository productoRepository;

    public ConsultarProductoPorId(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public Producto execute(int id) {
        return productoRepository.findById(id);
    }
}
