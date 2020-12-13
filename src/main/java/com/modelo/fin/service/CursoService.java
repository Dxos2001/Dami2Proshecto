package com.modelo.fin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modelo.fin.entity.Curso;
import com.modelo.fin.repository.CursoDAO;

@Service
public class CursoService {
	@Autowired
	private CursoDAO cursoDAO;
	
	public List<Curso> listAll(){
		return cursoDAO.findAll();
	}
	
}
