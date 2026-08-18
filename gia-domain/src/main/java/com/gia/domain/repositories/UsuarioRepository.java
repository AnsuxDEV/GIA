package com.gia.domain.repositories;

import java.util.List;
import com.gia.domain.entities.Usuario;

public interface UsuarioRepository {
    
    Usuario findById(int id);

    Usuario findByNombre(String nombre);

    List<Usuario> findAll();

    void save(Usuario usuario);

    void update(Usuario usuario);

    void delete(int id);

}
