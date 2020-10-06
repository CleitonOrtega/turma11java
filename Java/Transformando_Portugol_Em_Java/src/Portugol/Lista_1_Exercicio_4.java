package Portugol;

import java.util.Scanner;

public class Lista_1_Exercicio_4 {

	public static void main(String[] args) {
		/*
		 * double D,R,S,A,B,C;
		
		System.out.print("Digite o primeiro numero inteiro positivo: ")
		A = tecla.nextDouble;
		System.out.print("Digite o segundo numero inteiro positivo: ")
		B = tecla.nextDouble;
		System.out.print("Digite o terceiro numero inteiro positivo: ")
		C = tecla.nextDouble;
		
		R = A + B;
		R = R * R;
		S = B + C;
		S = S * S;
		D = (R + S)/2;
		System.out.printf("O resultado final é ",D);
		 */
		
		Scanner tecla = new Scanner(System.in);

		 double D,R,S,A,B,C;
			
			System.out.print("Digite o primeiro numero inteiro positivo: ");
			A = tecla.nextDouble();
			System.out.print("Digite o segundo numero inteiro positivo: ");
			B = tecla.nextDouble();
			System.out.print("Digite o terceiro numero inteiro positivo: ");
			C = tecla.nextDouble();
			
			R = A + B;
			R = R * R;
			S = B + C;
			S = S * S;
			D = (R + S)/2;
			System.out.printf("O resultado final é %.2f",D);
		
		tecla.close();
	}

}
