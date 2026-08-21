package com.gia.usecases.producto;

import java.util.List;

import com.gia.domain.entities.Producto;
import com.gia.domain.repositories.ProductoRepository;

public class ConsultarTodosLosProductos {
    private final ProductoRepository productoRepository;

    public ConsultarTodosLosProductos(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> execute() {
        return productoRepository.findAll();
    }
}

