package com.modelo.fin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.modelo.fin.entity.Curso;
import com.modelo.fin.service.CursoService;

@RestController
@RequestMapping(value = "/curso")
public class CursoController {
	
	@Autowired
	private CursoService cursoService;
	
	@GetMapping(path ="/listaCurso" )
	@ResponseBody
	public List<Curso> listaCurso(){
		return cursoService.listAll();
	}
	
}
