package com.modelo.fin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.modelo.fin.entity.Alumno;

public interface AlumnoDAO extends JpaRepository<Alumno, Integer>{

}
