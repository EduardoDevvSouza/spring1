package com.br.edu.eduardo.entities;

	
	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	@Entity
	@Table (name = "xcliente")
	public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "xcliente")
	private String xcliente;

	@Column(name = "telefone")
	private double telefone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getxclinte() {
		return xcliente;
	}

	public void setxcliente(String xcliente) {
		this.xcliente = xcliente;
	}

	public double gettelefone() {
		return telefone;
	}

	public void settelefone(double telefone) {
		
	}
	}

