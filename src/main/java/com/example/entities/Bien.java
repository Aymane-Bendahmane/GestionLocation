package com.example.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.core.sym.Name;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bien implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long refference;
	private Double prix;
	private Date date_ajoute;
	private Double surface;
	private Integer nb_chambre;
	private Integer nb_etage;
	private Integer nb_salon;
	private Boolean balcon;
	private Boolean garage;
	private Boolean parking;
	private String description;
	private Boolean disponibilite;
	
	//un bien apartient a une commande
	@ManyToOne
	@JoinColumn(name="id_commande")
	private Commande commande;
	
	//un bien apartient a une proposition
	@ManyToOne
	@JoinColumn(name="id_proposition")
	private Proposition proposition;
	
	//un bien a un type
	@ManyToOne 
	@JoinColumn(name="id_type")
	private Type type;
	
	//un bien apartient a un quartier
	@ManyToOne
	@JoinColumn(name = "id_quartier" )
	private Quartier quartier;
	
	//un bien apartient a une transaction
	@ManyToOne
	@JoinColumn(name = "id_transaction")
	private Transaction transaction;
}
