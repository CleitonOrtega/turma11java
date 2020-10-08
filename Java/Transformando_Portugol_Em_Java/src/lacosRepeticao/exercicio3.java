package lacosRepeticao;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int cont21 = 0,cont50 = 0,idade = 0;
		
		System.out.println("Para sair do programa digite -99!");
		
		while(idade != -99) {
			
			System.out.print("Digite sua idade: ");
			idade = tec.nextInt();
			if(idade >= 0 && idade <= 20) {
				cont21 = cont21 + 1;
			}
			else if(idade >= 51) {
				cont50 = cont50 + 1;
			}
		}
		
		System.out.printf("\nO total de pessoas com a idade entre 0 e 21 é: %d",cont21);
		System.out.printf("\nO total de pessoas com a idade superior a 50 é: %d",cont50);		
		tec.close();
	}

}
