package com.modelo.fin.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="curso")
public class Curso implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idcurso")
	private int codCurso;
	@Column(name="nombre")
	private String nomCurso;
	@ManyToOne
	@JoinColumn(name="idNota")
	private Notas nota;
	@ManyToOne
	@JoinColumn(name="idProfesor")
	private Profesor profesor;
	
	public int getCodCurso() {
		return codCurso;
	}
	public void setCodCurso(int codCurso) {
		this.codCurso = codCurso;
	}
	public String getNomCurso() {
		return nomCurso;
	}
	public void setNomCurso(String nomCurso) {
		this.nomCurso = nomCurso;
	}
	public Notas getNota() {
		return nota;
	}
	public void setNota(Notas nota) {
		this.nota = nota;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	

	
}
