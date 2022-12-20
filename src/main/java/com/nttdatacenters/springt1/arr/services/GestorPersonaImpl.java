package com.nttdatacenters.springt1.arr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdatacenters.springt1.arr.persistence.Persona;
import com.nttdatacenters.springt1.arr.persistence.PersonaRepositoryI;

/**
 * Servicio de gestión de las personas del edificio
 * @author Alexandra Rodríguez
 *
 */
@Service
public class GestorPersonaImpl implements GestorPersonaI {
	
	/** Repositorio de personas */
	@Autowired
	private PersonaRepositoryI personaRepo;

	@Override
	public void addPersona(final Persona newPersona) {
		// Validación de integridad.
		if (newPersona != null && newPersona.getPersonaId() == null) {
			// Insercción.
			personaRepo.save(newPersona);
		}

	}

	@Override
	public List<Persona> getAllPersons() {
		return personaRepo.findAll();
	}

	@Override
	public void deletePersona(final Persona deletePersona) {
		// Validación de integridad.
		if (deletePersona != null) {
			// Eliminación.
			personaRepo.delete(deletePersona);
		}
	}

	@Override
	public Persona getPersonaById(final Long personaId) {
		return personaRepo.getReferenceById(personaId);
	}

}
