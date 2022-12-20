package com.nttdatacenters.springt1.arr;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdatacenters.springt1.arr.persistence.Apartamento;
import com.nttdatacenters.springt1.arr.persistence.Edificio;
import com.nttdatacenters.springt1.arr.persistence.Persona;
import com.nttdatacenters.springt1.arr.persistence.Planta;
import com.nttdatacenters.springt1.arr.utils.EdificioUtils;

@SpringBootApplication
public class SpringT1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringT1Application.class, args);
		
		Edificio edificio = EdificioUtils.getInstance().createEdificio();
		
		System.out.println("Número de edificio: " + edificio.getEdificioId());
		System.out.println("Número de plantas: " + edificio.getPlantas().size());
		
		for (int i = 0; i < edificio.getPlantas().size(); i ++) {
			Planta planta = edificio.getPlantas().get(i);
			
			System.out.println("Número de planta: " + planta.getNumeroDePlanta());
			System.out.println("Número de apartamentos: " + planta.getApartamentos().size());
			
			for (int j = 0; j < planta.getApartamentos().size(); j++) {
				Apartamento apartamento = planta.getApartamentos().get(j);
				
				System.out.println("Número de apartamento: " + apartamento.getNumeroDeApartamento());
				System.out.println("Número de personas viviendo en el apartamento: " + apartamento.getInquilinos().size());
				
				List<Persona> personasList = apartamento.getInquilinos();
				
				for (int k = 0; k < personasList.size(); k ++) {
					Persona persona = personasList.get(k);
					
					System.out.println("Nombre: " + persona.getNombre());
					System.out.println("Apellido 1: " + persona.getApellido1());
					System.out.println("Apellido 2: " + persona.getApellido2());
				}
			}
		}
	}

}