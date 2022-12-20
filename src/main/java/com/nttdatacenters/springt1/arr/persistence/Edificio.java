package com.nttdatacenters.springt1.arr.persistence;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "T_EDIFICIO")
public class Edificio extends AbstractEntity implements Serializable {

	/** SERIAL VERSION */
	private static final long serialVersionUID = 1L;

	/** ID del Edificio (PK) **/
	private Long edificioId;

	/** Lista de Plantas **/
	private List<Planta> plantas;

	public Edificio(Long edificioId, List<Planta> plantas) {
		super();
		this.edificioId = edificioId;
		this.plantas = plantas;
	}

	// Getters and Setters

	/**
	 * @return edificioId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "C_PK_EDIFICIO_ID")
	public Long getEdificioId() {
		return edificioId;
	}

	/**
	 * 
	 * @param edificioId
	 */
	public void setEdificioId(Long edificioId) {
		this.edificioId = edificioId;
	}

	/**
	 * 
	 * @return plantas
	 */
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "owner")
	public List<Planta> getPlantas() {
		return plantas;
	}

	/**
	 * 
	 * @param plantas
	 */
	public void setPlantas(List<Planta> plantas) {
		this.plantas = plantas;
	}

}
