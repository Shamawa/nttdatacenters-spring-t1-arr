package com.nttdatacenters.springt1.arr.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import com.nttdatacenters.springt1.arr.persistence.Apartamento;
import com.nttdatacenters.springt1.arr.persistence.Edificio;
import com.nttdatacenters.springt1.arr.persistence.Persona;
import com.nttdatacenters.springt1.arr.persistence.Planta;

public final class EdificioUtils {
	
	private static EdificioUtils instance;
	
	public static EdificioUtils getInstance() {
		if (instance == null) {
			instance = new EdificioUtils();
		}
		return instance;
	}
	
	private int getRandomNumber() {
		return ThreadLocalRandom.current().nextInt(1, 5 + 1);
	}
	
	private List<Persona> createPersonas(int numeroPersonas) {
		ArrayList<Persona> personasList = new ArrayList<Persona>();
		
		for (int i = 0; i < numeroPersonas; i ++) {
			personasList.add(new Persona(Long.valueOf(i), "Nombre: " + i, "Apellido 1: " + i, "Apellido 2: " + i));
		}
		
		return personasList;
	}
	
	private List<Apartamento> createApartamentos(int numeroApartamentos) {
		ArrayList<Apartamento> apartamentosList = new ArrayList<Apartamento>();
		
		for (int i = 0; i < numeroApartamentos; i ++) {
			apartamentosList.add(new Apartamento(i, i, createPersonas(getRandomNumber())));
		}
		
		return apartamentosList;
	}
	
	private List<Planta> createPlantas(int numeroPlantas) {
		ArrayList<Planta> plantasList = new ArrayList<Planta>();
		
		for (int i = 0; i < numeroPlantas; i ++) {
			plantasList.add(new Planta(i, createApartamentos(5)));
		}
		
		return plantasList;
	}
	
	public Edificio createEdificio() {
		return new Edificio(1L, createPlantas(10));
	}
	
}
