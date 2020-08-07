package com.example.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
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
public class Proposition implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_proposition;
	private Date  date_proposition;
	
	//une proposition apartient a un user
	@ManyToOne @JoinColumn(name="id_User", nullable=false)
	private User user_proposition ;
	
	//une proposition peut contenir biens
	@OneToMany(mappedBy = "proposition") 
	private Collection<Bien> biens;
}
