package com.modelo.fin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modelo.fin.entity.Profesor;
import com.modelo.fin.repository.ProfesorDAO;

@Service
public class ProfesorService {
	@Autowired
	private ProfesorDAO profesorDAO;
	
	public List<Profesor> listAll(){
		return profesorDAO.findAll();
	}
}
