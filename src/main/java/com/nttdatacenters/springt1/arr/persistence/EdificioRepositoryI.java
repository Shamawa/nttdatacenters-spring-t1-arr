package com.nttdatacenters.springt1.arr.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio
 * @author Alexandra Rodríguez
 *
 */
@Repository
public interface EdificioRepositoryI extends JpaRepository<Edificio, Long> {
	public Optional<Edificio> findById(final Long id);

}
