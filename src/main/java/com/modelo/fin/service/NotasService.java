package com.modelo.fin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modelo.fin.entity.Notas;
import com.modelo.fin.repository.NotasDAO;

@Service
public class NotasService {
	@Autowired
	private NotasDAO notasDAO;
	
	public List<Notas> listAll(){
		return notasDAO.findAll();
	}
}
