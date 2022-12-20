package com.nttdatacenters.springt1.arr.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Alexandra Rodríguez
 *
 */

@Repository
public interface PersonaRepositoryI extends JpaRepository<Persona, Long>{
	
	/** Búsqueda de personas por nombre
	 * 
	 */
	public List<Persona> findByName(final String name);
}
