package com.example.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Commande implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_command;
	private Date date_commande;
	
	//une commande apartient a un user
	@ManyToOne @JoinColumn(name="id_User", nullable=false)
    private User user_commande;
	
	//un commnde peut contenir plusieur biens
	@OneToMany(mappedBy = "commande") 
	private Collection<Bien> biens;
}
