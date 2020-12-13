package com.modelo.fin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modelo.fin.entity.Alumno;
import com.modelo.fin.repository.AlumnoDAO;

@Service
public class AlumnoService {
	@Autowired
	private AlumnoDAO alumnoDAO;

	public List<Alumno> listAll(){
		return alumnoDAO.findAll();
	}
	
	public void saveAlumno(Alumno alum) {
		alumnoDAO.save(alum);
	}
}
