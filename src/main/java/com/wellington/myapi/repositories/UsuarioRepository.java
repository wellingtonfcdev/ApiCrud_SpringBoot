package com.wellington.myapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellington.myapi.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
