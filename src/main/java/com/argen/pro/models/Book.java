package com.argen.pro.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer id;
	private Long isbn;
	private String titulo;
	private Integer anio;
	private Integer ejemplares;
	private Integer ejemplaresPrestados;
	private Integer ejemplaresRestantes;
	private Boolean alta;

	@OneToOne
	@JoinColumn(name = "idAutor")
	private Author autor;

	@OneToOne
	@JoinColumn(name = "idEditorial")
	private Editorial editorial;

}
