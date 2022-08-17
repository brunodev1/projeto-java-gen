package com.generation.cachorro.model;

public class Cachorro extends Animal
{
	private String tamanho;

	public Cachorro(String cor, String raca, String sexo, int idade, String tamanho) {
		super(cor, raca, sexo, idade);
		this.tamanho = tamanho;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
}
