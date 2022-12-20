package com.nttdatacenters.springt1.arr.services;

import java.util.List;

import com.nttdatacenters.springt1.arr.persistence.Edificio;

/**
 * Servicio de gestión de edificios
 * 
 * @author Alexandra Rodríguez
 *
 */
public interface GestorEdificioI {

	/**
	 * Método para la insercción de personas.
	 * 
	 * @param newEdificio
	 */
	public void addEdificio(final Edificio newEdificio);
	

	/**
	 * Elimina un edivicio.
	 * 
	 * @param deleteEdificio
	 */
	public void deleteEdificio(final Edificio deleteEdificio);
	
	/**
	 * Obtiene listado de edificios.
	 * @return
	 */
	public List<Edificio> getAllEdificios();

	/**
	 * Otiene el Id del Edificio
	 * @param edificioId
	 * @return
	 */
	public Edificio getEdificioById(final Long edificioId);

}
