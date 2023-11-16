package com.alicie.lombok.projetoLombok.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alicie.lombok.projetoLombok.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

}
