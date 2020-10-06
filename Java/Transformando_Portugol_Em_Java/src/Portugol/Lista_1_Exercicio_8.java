package Portugol;

import java.util.Scanner;

public class Lista_1_Exercicio_8 {

	public static void main(String[] args) {
		
		Scanner tecla = new Scanner(System.in);
		double valorFabrica, valorImpostos;
		System.out.print("Qual o valor do carro (custo de fabrica)?\n");
		valorFabrica = tecla.nextDouble();
		valorFabrica = valorFabrica*1.28;
		valorImpostos = (valorFabrica*1.28) + (valorFabrica*1.45);

		System.out.printf("O valor final do carro para o consumidor é: %.2f",valorImpostos);
	
		tecla.close();

	}

}
