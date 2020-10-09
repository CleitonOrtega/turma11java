package array;

import java.util.Scanner;
import java.util.Random;


public class exercicio3 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		Random gerador = new Random();
		int  matriz[][] = new int [3][3],coluna = 0,linha = 0,contador = 0;
		
		for(linha = 0; linha < 3;linha++) {
			for(coluna = 0; coluna < 3;coluna++) {
				matriz[linha][coluna] = gerador.nextInt(21);
				if(matriz[linha][coluna] > 10) {
					contador++;
				}
			}
		}
		System.out.println("Veja a matriz: ");
		for(linha = 0; linha < 3;linha++) {
			for(coluna = 0; coluna < 3;coluna++) {
				System.out.print("[" + matriz[linha][coluna] + "]");
			}
			System.out.println();
		}
		
		System.out.printf("Nesta matriz tem %d numeros maiores que 10!",contador);
		
		tec.close();
	}

}
