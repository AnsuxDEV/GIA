package com.gia.usecases.producto;

import com.gia.domain.entities.Producto;
import com.gia.domain.repositories.ProductoRepository;

public class CrearProducto {
    
    private final ProductoRepository productoRepository;

    public CrearProducto (ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public void execute(String nombre, String categoria, String codigoBarras) {
        Producto producto = new Producto(0, nombre, categoria, 0, 0, null, codigoBarras);
        productoRepository.save(producto);
    }

}
