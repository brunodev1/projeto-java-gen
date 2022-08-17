package com.generation.cachorro.model;

public class Animal
{
	public String cor;
	public String raca;
	public String sexo;
	public int idade;
	
	public Animal(String cor, String raca,String sexo, int idade) 
	{
		this.cor = cor;
		this.raca = raca;
		this.sexo = sexo;
		this.idade = idade;
	}
	public String getCor() 
	{
		return cor;
	}
	public void setCor(String cor) 
	{
		this.cor = cor;
	}
	public String getRaca() 
	{
		return raca;
	}
	public void setRaca(String raca) 
	{
		this.raca = raca;
	}
	public String getSexo() 
	{
		return sexo;
	}
	public void setSexo(String sexo) 
	{
		this.sexo = sexo;
	}
	public int getIdade() 
	{
		return idade;
	}
	public void setIdade(int idade) 
	{
		this.idade = idade;
	}
	public void Visualizar()
	{
	 System.out.println("**********************************************");
     System.out.println("\nDados do Animal:");
     System.out.println("***********************************************");
     System.out.println("Cor do animal: " + this.cor);
     System.out.println("Raça do animal: " + this.raca);
     System.out.println("Sexo do animal: "+ this.sexo);
     System.out.println("Idade do animal: " + this.idade);
	}
}
