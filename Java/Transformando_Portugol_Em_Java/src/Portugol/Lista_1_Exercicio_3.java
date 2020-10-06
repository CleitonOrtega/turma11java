package Portugol;

import java.util.Scanner;

public class Lista_1_Exercicio_3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int qtdHoras=0,qtdMinutos=0,qtdSegundos, tempoDuracao;

		System.out.println("Aplicativo de conversão de tempo para segundos:");
		System.out.println("Digite a quantidade de Segundos:");
		tempoDuracao = leia.nextInt();
		qtdHoras = tempoDuracao/3600;
		qtdMinutos = (tempoDuracao%3600)/60;
		qtdSegundos = (tempoDuracao%3600)%60;
		System.out.printf("\nA quantidade total de Horas é: "+ qtdHoras);
		System.out.printf("\nA quantidade total de Minutos é: "+ qtdMinutos);
		System.out.printf("\nA quantidade total de Segundos é: "+ qtdSegundos);
		leia.close();
	}

}
