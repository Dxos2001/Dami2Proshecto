package com.modelo.fin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modelo.fin.entity.Notas;

public interface NotasDAO extends JpaRepository<Notas, Integer> {

}
