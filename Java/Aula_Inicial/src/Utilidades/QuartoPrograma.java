package Utilidades;

import java.util.Scanner;

public class QuartoPrograma {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		String nome = " ";
		int anoNasc = 0,idade = 0;
		double salario = 0.0 ;
		
		System.out.print("Digite seu nome: ");
		nome = tec.next();
		System.out.print("Digite o seu ano de nascimento: ");
		anoNasc = tec.nextInt();
		System.out.print("Digite o seu salario: ");
		salario = tec.nextDouble();
		idade = 2020 - anoNasc;
		System.out.printf("Oi %s Você tem %d e seu salario é: %.2f", nome,idade,salario);

		tec.close();
	}

}
