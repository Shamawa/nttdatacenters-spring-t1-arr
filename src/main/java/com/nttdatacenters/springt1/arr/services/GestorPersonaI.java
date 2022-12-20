package com.nttdatacenters.springt1.arr.services;

import java.util.List;
import com.nttdatacenters.springt1.arr.persistence.Persona;

public interface GestorPersonaI {
	
	/**
	 * Método para añadir personas al Edificio
	 */
	
	/**
	 * Método para la insercción de personas.
	 * 
	 * @param newPerson
	 */
	public void addPersona(final Persona newPersona);

	/**
	 * Obtiene listado de personas del sistema.
	 * 
	 * @return List<Persona>
	 */
	public List<Persona> getAllPersons();

	/**
	 * Método para la eliminación de una persona.
	 * 
	 * @param deletePerson
	 */
	public void deletePersona(final Persona deletePersona);

	/**
	 * Obtiene persona del sistema a través del ID.
	 * 
	 * @param personId
	 * @return Person
	 */
	public Persona getPersonaById(final Long personaId);

}
