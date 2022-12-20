package com.nttdatacenters.springt1.arr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdatacenters.springt1.arr.persistence.Edificio;
import com.nttdatacenters.springt1.arr.services.GestorEdificioI;

@RestController
@RequestMapping("/api")
public class HomeRestController {

	/** Servicio de gestión de la clínica */
	@Autowired
	private GestorEdificioI gestorEdificio;

	@GetMapping
	public List<Edificio> showAllEdificio() {
		return gestorEdificio.getAllEdificios();
	}

	@PostMapping
	public void addNewEdificioIntoSystem(final @RequestBody Edificio newEdificio) {
		gestorEdificio.addEdificio(newEdificio);
	}

	@GetMapping("/findEdificio")
	public Edificio searchBy(final @RequestBody Edificio requestEdificio) {
		return gestorEdificio.getEdificioById(requestEdificio.getEdificioId());
	}

}
