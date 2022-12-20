package com.nttdatacenters.springt1.arr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdatacenters.springt1.arr.persistence.Edificio;
import com.nttdatacenters.springt1.arr.persistence.EdificioRepositoryI;

@Service
public class GestorEdificioImpl implements GestorEdificioI {

	@Autowired
	private EdificioRepositoryI edificioRepo;

	/** Repositorio de Edificios */
	@Override
	public void addEdificio(Edificio newEdificio) {
		// Validación de integridad.
		if (newEdificio != null && newEdificio.getEdificioId() == null) {
			// Insercción.
			edificioRepo.save(newEdificio);
		}
	}

	@Override
	public void deleteEdificio(Edificio deleteEdificio) {
		// Validación de integridad.
		if (deleteEdificio != null) {
			// Eliminación.
			edificioRepo.delete(deleteEdificio);
		}
	}

	@Override
	public Edificio getEdificioById(Long edificioId) {
		return edificioRepo.getReferenceById(edificioId);

	}

	@Override
	public List<Edificio> getAllEdificios() {
		return edificioRepo.findAll();
	}
	
}
