package implementandoClasses;

import java.util.Collection;
import java.util.Scanner;

import classes.classeLoja;

import java.util.ArrayList;

public class loja {
	
	public static classeLoja Loja = new classeLoja();
	public static Scanner leia = new Scanner(System.in);
	
	public static String armazenarRoupa;
	
	public static char opcaoDesejada;
	

	public static void main(String[] args) {
		
		Collection<String> estoque = new ArrayList();

		System.out.println("Bem-Vindo a "+ Loja.getNomeLoja());
		System.out.println();
		
		do {
			System.out.println("Você deseja:\n1-Armazenar roupas do estoque\n2-Remover roupas do estoque\n3-Atualizar o estoque\n4-Mostrar estoque atual");
			opcaoDesejada = leia.next().charAt(0);
		if(opcaoDesejada == '1') {
			do {
			System.out.println("Qual roupa você deseja armazenar?");
			armazenarRoupa = leia.next();
			Loja.adicionarRoupas(armazenarRoupa);
			System.out.print("Deseja armazenar outras roupas? 1-Sim, 2-Não\nOpção escolhida: ");
			opcaoDesejada = leia.next().charAt(0);
			}while(opcaoDesejada == '1');
		}
		else if(opcaoDesejada == '2') {
			if(estoque.size() > 0) {
			System.out.println("Estoque Atual: ");
			Loja.getEstoque();
			System.out.println();
			System.out.println("Qual roupa você deseja remover?");
			armazenarRoupa = leia.next();
			estoque.remove(armazenarRoupa);
			}else {
				System.out.println("Não tem roupas no estoque impossivel remover!");
			}
		}
		else if(opcaoDesejada == '3') {
			estoque.clear();
			System.out.println("Digite o novo estoque ");
			do {
				System.out.print("Digite o nome da peça a ser adicionada: ");
				armazenarRoupa = leia.next();
				estoque.add(armazenarRoupa);
				System.out.println("Deseja sair? 1 - Sim, 2 - Não");
				opcaoDesejada = leia.next().charAt(0);
			}while(opcaoDesejada != '1');
			armazenarRoupa = leia.next();
			estoque.add(armazenarRoupa);
		}
		else if(opcaoDesejada == '4') {
			System.out.println("Estoque Atual: ");
			Loja.getEstoque();
		}
		else {
			System.out.println("Valor invalido tente novamente depois!");
		}
		System.out.print("Deseja sair do programa? 1 - Sim, 2 - Não\nOpção escolhida: ");
		opcaoDesejada = leia.next().charAt(0);
	}while(opcaoDesejada != '1');
		System.out.println("Estoque Atual: ");
		Loja.getEstoque();
	}

}
