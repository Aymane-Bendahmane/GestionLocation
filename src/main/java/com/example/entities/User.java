package com.example.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_user;
	private String nom;
	private String prenom;
	private String email;
	private String login;
	private String password;
	private Integer role;
	
	//Un utilisateur peut faire plusieur commande
	@OneToMany (mappedBy = "user_commande",fetch=FetchType.LAZY)
	 private List<Commande> commands = new ArrayList<>();
	
	//Un utilisateur peut faire plusieur propositions
	@OneToMany (mappedBy = "user_proposition",fetch=FetchType.LAZY)
	 private List<Proposition> Propositions = new ArrayList<>();
}
