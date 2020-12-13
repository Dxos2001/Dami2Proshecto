package com.modelo.fin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modelo.fin.entity.Profesor;

public interface ProfesorDAO extends JpaRepository<Profesor, Integer> {
	
}
