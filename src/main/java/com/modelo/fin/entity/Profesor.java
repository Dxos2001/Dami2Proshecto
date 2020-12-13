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
@Table(name="profesor")
public class Profesor implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idprofesor")
	private int codProfesor;
	@Column(name="nombre")
	private String nomProfesor;
	@Column(name="apellido")
	private String apellidoProfesor;

	public int getCodProfesor() {
		return codProfesor;
	}
	public void setCodProfesor(int codProfesor) {
		this.codProfesor = codProfesor;
	}
	public String getNomProfesor() {
		return nomProfesor;
	}
	public void setNomProfesor(String nomProfesor) {
		this.nomProfesor = nomProfesor;
	}
	public String getApellidoProfesor() {
		return apellidoProfesor;
	}
	public void setApellidoProfesor(String apellidoProfesor) {
		this.apellidoProfesor = apellidoProfesor;
	}
}
