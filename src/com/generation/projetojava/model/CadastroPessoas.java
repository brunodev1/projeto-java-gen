package com.generation.cachorro.model;

import java.util.Scanner;

public class CadastroPessoas 
{
	private String nome;
	private int idade;
	private String email;
	private String cpf;
	private String rua;
	private int numero;
	private int cep;
	public CadastroPessoas(String nome, int idade, String email, String cpf, String rua, int numero, int cep) 
	{
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.cpf = cpf;
		this.rua = rua;
		this.numero = numero;
		this.cep = cep;
	}
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public int getIdade() 
	{
		return idade;
	}
	public void setIdade(int idade) 
	{
		this.idade = idade;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getCpf() 
	{
		return cpf;
	}
	public void setCpf(String cpf) 
	{
		this.cpf = cpf;
	}
	public String getRua() 
	{
		return rua;
	}
	public void setRua(String rua) 
	{
		this.rua = rua;
	}
	public int getNumeroCasa() 
	{
		return numero;
	}
	public void setNumeroCasa(int numeroCasa) 
	{
		this.numero = numeroCasa;
	}
	public int getCep() 
	{
		return cep;
	}
	public void setCep(int cep) 
	{
		this.cep = cep;
	}
	public void visualizeCadastro() 
	{
		Scanner leia = new Scanner(System.in);
		System.out.println("\nInsira seu nome: ");
		nome = leia.next();
		System.out.println("\nQuantos anos voce tem? ");
		idade = leia.nextInt();
		System.out.println("\nQual é o seu e-mail? ");
		email = leia.next();
		System.out.println("\nInsira seu CPF: ");
		cpf = leia.next();
		System.out.println("\nEndereco: ");
		rua = leia.next();
		System.out.println("\nNumero da casa: ");
		numero = leia.nextInt();
		System.out.println("\nCEP: ");
		cep = leia.nextInt();
		CadastroPessoas c1 = new CadastroPessoas(nome,idade ,email, cpf, rua,numero, cep);
		System.out.println("\nVocê gostaria de gato ou cachorro? ");
		System.out.println("\nDigite 1-Cachorro ou 2-Gato: ");
		c1.visualizeAnimal();
		
	}
	public void visualizeAnimal()
	{
		int opcao=0;
		Cachorro dog1 = new Cachorro("Caramelo","SRD", "Macho",2,"Médio");
		Cachorro dog2 = new Cachorro("Branco","SRD","Macho", 1, "Médio");
		Cachorro dog3 = new Cachorro("Marrom","Poodle","Macho", 4,"Médio");
		
		Gato cat1 = new Gato("Preto","Femea","SRD",2);
		Gato cat2 = new Gato("Branco com mancha marrom","Macho","SRD",1);
		
		Scanner leia = new Scanner(System.in);
		opcao=leia.nextInt();
		
		switch (opcao)
		{
		case 1:
			
			System.out.println("\n************************************************\n");
			System.out.println("Verifique os cachorros disponiveis: ");
			System.out.println("************************************************");
			dog1.Visualizar();	
			dog2.Visualizar();
			dog3.Visualizar();
		
		break;
		case 2:
			System.out.println("\n************************************************\n");
			System.out.println("Verifique os gatos disponiveis: ");
			System.out.println("************************************************");
			cat1.Visualizar();
			cat2.Visualizar();
			
			break;
		
		
		}
	
		}
}