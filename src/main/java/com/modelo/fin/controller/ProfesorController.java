package com.modelo.fin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.modelo.fin.entity.Profesor;
import com.modelo.fin.repository.ProfesorDAO;

@RestController
@RequestMapping(value = "/profesor")
public class ProfesorController {
	@Autowired
	private ProfesorDAO profesorDAO;
	
	@GetMapping(path ="/listaProfesor" )
	@ResponseBody
	public List<Profesor> listaProfesor(){
		return profesorDAO.findAll();
	}
}
