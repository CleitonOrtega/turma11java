package lacosRepeticao;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int cont = 1,idade,numPessoasCalmas = 0,numMulheresNerv = 0,numHomensAgre = 0,outrosCalmos = 0,pessoasNerv40 = 0,pessoasCalmas18 = 0,sexo,opcoes;
		
		while(cont <= 150) {
			
			System.out.printf("\nFuncionario numero %d",cont);
			
			System.out.print("\nDigite sua idade: ");
			idade = tec.nextInt();
			System.out.print("Digite seu o numero correspondente ao seu sexo sendo\n1(Masculino),2(Feminino),3(Outros): ");
			sexo = tec.nextInt();
			System.out.print("Digite seu o numero correspondente ao seu estado de espirito sendo\n1(Calmo(a)),2(Nervoso(a)),3(Agressivo(a)): ");
			opcoes = tec.nextInt();
			
			if(opcoes == 1) {
				numPessoasCalmas = numPessoasCalmas + 1;
			}
			if(sexo == 2 && opcoes == 2) {
				numMulheresNerv = numMulheresNerv + 1;
			}
			else if(sexo == 1 && opcoes == 3) {
				numHomensAgre = numHomensAgre + 1;
			}
			else if(sexo == 3 && opcoes == 1){
				outrosCalmos = outrosCalmos + 1;
			}
			if(idade > 40) {
				pessoasNerv40 = pessoasNerv40+1;
			}
			if(idade < 18) {
				pessoasCalmas18 = pessoasCalmas18 + 1 ;
			}
			
			cont = cont + 1;
		}
		
		System.out.printf("\nO total de pessoas calmas é: %d",numPessoasCalmas);
		System.out.printf("\nO total de mulheres nervosas é: %d",numMulheresNerv);
		System.out.printf("\nO total de homens agressivos é: %d",numHomensAgre);
		System.out.printf("\nO total de outros calmos é: %d",outrosCalmos);
		System.out.printf("\nO total de pessoas nervosas com mais de 40 anos é: %d",pessoasNerv40);
		System.out.printf("\nO total de pessoas calmas com menos de 18 anos é: %d",pessoasCalmas18);
		tec.close();
	}

}
