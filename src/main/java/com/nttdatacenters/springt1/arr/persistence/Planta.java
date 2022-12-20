package com.nttdatacenters.springt1.arr.persistence;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "T_PLANTA")
public class Planta {
	
	private int numeroDePlanta;
	
	private List<Apartamento> apartamentos;

	public Planta(int numeroDePlanta, List<Apartamento> apartamentos) {
		this.numeroDePlanta = numeroDePlanta;
		this.apartamentos = apartamentos;
	}

	public int getNumeroDePlanta() {
		return numeroDePlanta;
	}

	public void setNumeroDePlanta(int numeroDePlanta) {
		this.numeroDePlanta = numeroDePlanta;
	}

	public List<Apartamento> getApartamentos() {
		return apartamentos;
	}

	public void setApartamentos(List<Apartamento> apartamentos) {
		this.apartamentos = apartamentos;
	}

}
