package com.generation.cachorro.model;

import java.util.Scanner;

public class Introducao1 
{

public void Introducao1()
{
	int opcao = 0;
	while(opcao!=3)
	{
	Scanner leia = new Scanner (System.in);
	System.out.println("\tBEM VINDO A ONG NEW HOUSE!");
	System.out.println("\n\tPara adotar, digite 1");
	System.out.println("\n\tPara denuncia, digite 2:");
	System.out.println("\n\tDigite 3 para sair: ");
	opcao = leia.nextInt();
	switch (opcao) 
	{
	case 1:
		System.out.println("\nFicamos felizes por querer adotar um amiguinho! Para continuarmos o processo, fa�a o cadastro: ");
		CadastroPessoas c1 = new CadastroPessoas(null, 0, null, null, null, 0, 0);
		c1.visualizeCadastro();
		break;
	case 2: 
	
		System.out.println("A den�ncia de maus-tratos � legitimada pelo Art. 32, da Lei Federal n�. 9.605, de 12.02.1998 \n(Lei de Crimes Ambientais) e pela Constitui��o Federal Brasileira, de 05 de outubro de 1988.");
        System.out.println();
        System.out.println("Digite '1' para:descrever detadalhamente o ocorrido ou digite '2' para: receber n�meros recomendados para sua denuncia?");
        int opDenuncia = leia.nextInt();

        if(opDenuncia == 1){
            Scanner sc = new Scanner(System.in);
            System.out.println("\nInforme o endere�o: ");
            String endereco=sc.nextLine();
            System.out.println("\nInforme o n�mero do local: ");
            int numero=sc.nextInt();
            System.out.println("\nDescreva detalhadamente o ocorrido abaixo:");
            String desc = sc.next();

            System.out.println("\nConfirme: " + desc + " Digite 'S' se estiver correto ou digite 'N' se n�o estiver correto;");
            System.out.println("Sua denuncia est� correta?");
            Character confirmDesc = sc.next().charAt(0);

            if (confirmDesc == 'S' || confirmDesc == 's'){
                System.out.println("\nDenuncia Registrada com Sucesso\n");
            }
            else if(confirmDesc == 'N' || confirmDesc == 'n'){
                System.out.println("informa��o invalida, volte ao inicio");
                break;
            }
        }else if(opDenuncia == 2){
            System.out.println("0800 61 8080");
        }else{
            System.out.println("Digite um numero v�lido");
        }
	
	case 3:
		System.out.println("Obrigado por sua visita!");
		break;
	}
}
}
}

