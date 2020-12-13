package com.modelo.fin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.modelo.fin.entity.Alumno;
import com.modelo.fin.service.AlumnoService;

@RestController
@RequestMapping(value = "/alumno")
public class AlumnoController {
	@Autowired
	private AlumnoService alumnoService;
	
	@GetMapping(path ="/listaAlumno" )
	@ResponseBody
	public List<Alumno> listaAlumno(){
		return alumnoService.listAll();
	}
}
