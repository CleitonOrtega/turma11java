package Portugol;

import java.util.Scanner;

public class Lista_1_Exercicio_6 {

	public static void main(String[] args) {
		/*
		
		 */
		Scanner tecla = new Scanner(System.in); 
		double x1,x2,y1,y2,d = 0;
		System.out.print("Digite o X1: ");
		x1 = tecla.nextDouble();
		System.out.print("Digite o X2: ");
		x2 = tecla.nextDouble();
		System.out.print("Digite o Y1: ");
		y1 = tecla.nextDouble();
		System.out.print("Digite o Y2: ");
		y2 = tecla.nextDouble();
		d=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
		System.out.printf("O resultado é: %.2f",d);
		tecla.close();

	}

}
