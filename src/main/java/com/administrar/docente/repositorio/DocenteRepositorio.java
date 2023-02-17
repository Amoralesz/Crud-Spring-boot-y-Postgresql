package com.administrar.docente.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.administrar.docente.modelo.Docente;

@Repository
public interface DocenteRepositorio extends JpaRepository<Docente, Long>{

}
