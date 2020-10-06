package Portugol;

import java.util.Scanner;

public class Lista_1_Exercicio_5 {

	public static void main(String[] args) {
		
		Scanner tecla = new Scanner(System.in);
		double numero1, numero2, numero3, notaFinal = 0;
		System.out.print("Escreva a primeira nota: ");
		numero1 = tecla.nextDouble();
		System.out.print("Escreva a segunda nota: ");
		numero2 = tecla.nextDouble();
		System.out.print("Escreva a terceira nota: ");
		numero3 = tecla.nextDouble();
		numero1 = numero1 * 2;
		numero2 = numero2 * 3;
		numero3 = numero3 * 5;
		notaFinal = ((numero1 + numero2 + numero3)/10);
		System.out.printf("A nota final é: %.2f",notaFinal) ;
		tecla.close();
	}

}
