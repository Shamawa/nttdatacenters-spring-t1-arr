package com.nttdatacenters.springt1.arr.persistence;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "T_APARTAMENTO")
public class Apartamento {
	
	private int numeroDePlanta;
	
	private int numeroDeApartamento;
	
	private List<Persona> inquilinos;

	public Apartamento(int numeroDePlanta, int numeroDeApartamento, List<Persona> inquilinos) {
		this.numeroDePlanta = numeroDePlanta;
		this.numeroDeApartamento = numeroDeApartamento;
		this.inquilinos = inquilinos;
	}

	public int getNumeroDePlanta() {
		return numeroDePlanta;
	}

	public void setNumeroDePlanta(int numeroDePlanta) {
		this.numeroDePlanta = numeroDePlanta;
	}

	public int getNumeroDeApartamento() {
		return numeroDeApartamento;
	}

	public void setNumeroDeApartamento(int numeroDeApartamento) {
		this.numeroDeApartamento = numeroDeApartamento;
	}

	public List<Persona> getInquilinos() {
		return inquilinos;
	}

	public void setInquilinos(List<Persona> inquilinos) {
		this.inquilinos = inquilinos;
	}
	
	
	
	

}
