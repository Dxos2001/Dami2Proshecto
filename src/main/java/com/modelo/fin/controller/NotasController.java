package com.modelo.fin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.modelo.fin.entity.Notas;
import com.modelo.fin.repository.NotasDAO;
import com.modelo.fin.service.NotasService;

@RestController
@RequestMapping(value = "/notas")
public class NotasController {
	@Autowired
	private NotasService notasService;

	@GetMapping(path ="/listaNotas" )
	@ResponseBody
	public List<Notas> listaNotas(){
		return notasService.listAll();
	}
}
