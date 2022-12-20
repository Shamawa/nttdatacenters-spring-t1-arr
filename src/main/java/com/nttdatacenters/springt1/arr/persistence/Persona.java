package com.nttdatacenters.springt1.arr.persistence;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * 
 * Tabla de Personas
 * 
 * @author Alexandra Rodríguez
 *
 */
@Entity
@Table(name = "T_PERSONA")
public class Persona extends AbstractEntity implements Serializable {

	/** Serial Version */
	private static final long serialVersionUID = 1L;

	/** Identificador */
	private Long personaId;

	/** Nombre */
	private String nombre;

	/** Primer Apellido */
	private String apellido1;

	/** Segundo Apellido */
	private String apellido2;

	public Persona(Long personaId, String nombre, String apellido1, String apellido2) {
		this.personaId = personaId;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	}

	/**
	 * 
	 * @return
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "C_PK_PERSONA_ID")
	public Long getPersonaId() {
		return personaId;
	}

	public void setPersonaId(Long personaId) {
		this.personaId = personaId;
	}

	@Column(name = "C_NAME", nullable = false)
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return apellido1
	 */
	@Column(name = "C_APELLIDO1", nullable = false)
	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	/**
	 * 
	 * @return apellido2
	 */
	@Column(name = "C_APELLIDO2", nullable = false)
	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;

	}

}
