package lacoSe;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double numero, resultado = 0.0;
		System.out.print("Digite um numero que direi se ele �\nImpar, Par ou Negativo: ");
		System.out.println("E se for Par irei mostrar a raiz quadrada");
		System.out.print("E se for Impar irei mostrar o numero ao quadrado: ");
		numero = tec.nextDouble();
		if (numero < 0){
			System.out.printf("Voc� digitou %.0f, � um numero negativo",numero);
		}else if (numero == 0) {
			System.out.println("Voc� digitou 0, � um numero neutro");
		}else if (numero%2 == 0){
			System.out.printf("Voc� digitou %.0f, � um numero Par! e positivo",numero);
			resultado = Math.sqrt(numero);
			System.out.printf("\nE a raiz quadrada �: %.2f",resultado);
		}else{
			System.out.printf("Voc� digitou %.0f, � um numero Impar! e positivo",numero);
			resultado = Math.pow(numero,2);
			System.out.printf("\nE ele elevado ao quadrado �: %.2f",resultado);
		}
		
		tec.close();
	}

}
