package com.argen.pro.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Editorial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer idEditorial;
	private String nombre;
	private Boolean alta;

}
