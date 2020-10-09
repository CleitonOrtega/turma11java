package array;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		final int LIMITE = 2;
		
		double matriz1[][] = new double[LIMITE][LIMITE],matriz2[][] = new double[LIMITE][LIMITE];
		int linha = 0, coluna = 0,x =0,valorConst = 0;
		char opcao,escolhaMatriz;
		
		while(x < LIMITE) 
		{
			System.out.printf("Digite os valores da %d° matriz!",x+1);
			System.out.println();
			for(coluna = 0;coluna < LIMITE;coluna++)
			{
				for(linha = 0;linha < LIMITE;linha++)
				{
					System.out.printf("Digite o valor da Coluna: %d,Linha: %d:",coluna + 1,linha + 1);
					if(x == 0)
					{
						matriz1[coluna][linha] = tec.nextDouble();
					}
					else
					{
						matriz2[coluna][linha] = tec.nextDouble();
					}
				}
			}
			x++;
			System.out.println();
		}
		
		do {
			
			System.out.println("Opção 1 - Somar as duas matrizes");
			System.out.println("Opção 2 - Subtrair a primeira matriz pela segunda");
			System.out.println("Opção 3 - Adicionar uma constante as duas matrizes");
			System.out.println("Opção 4 - Imprimir as matrizes");
			System.out.println("Opção 5 - Sair do programa");
			
			System.out.print("A opção escolhida foi: ");
			opcao = tec.next().charAt(0);
			System.out.println();
			switch (opcao)
			{
				case '1': {
					System.out.println("Você escolheu a opção 1\nA soma das matrizes é: ");
					for(coluna = 0;coluna < LIMITE;coluna++) {
						for(linha = 0;linha < LIMITE;linha++) {
							System.out.print("[" +(  matriz1[coluna][linha] + matriz2[coluna][linha]  )+"]");
						}	
						System.out.println();
					}
					
					break;
				}
				case '2': {
					System.out.println("Você escolheu a opção 2\nA subtração da 1° matriz pela 2° matriz é: ");
					for(coluna = 0;coluna < LIMITE;coluna++) {
						for(linha = 0;linha < LIMITE;linha++) {
							System.out.print("[" +(  matriz1[coluna][linha] - matriz2[coluna][linha]  )+"]");
						}	
						System.out.println();
					}
					
					break;
				}
				case '3': {
					System.out.println("Você escolheu a opção 3\nDeseja adicionar uma soma em qual matriz? ");
					System.out.print("A 1° matriz ou a 2° matriz, Digite o numero dela!: ");
					escolhaMatriz = tec.next().charAt(0);
					System.out.printf("Digite o valor a ser somado na %s° matriz: ",escolhaMatriz);
					valorConst = tec.nextInt();
					if(escolhaMatriz == '1') {
						for(coluna = 0;coluna < LIMITE;coluna++) {
							for(linha = 0;linha < LIMITE;linha++) {
								matriz1[coluna][linha] = matriz1[coluna][linha] + valorConst;
							}
						}
						
					}else if(escolhaMatriz == '2') {
						for(coluna = 0;coluna < LIMITE;coluna++) {
							for(linha = 0;linha < LIMITE;linha++) {
								matriz2[coluna][linha] = matriz1[coluna][linha] + valorConst;
							}
						}
						
					}
					
					x = 0;
					while(x < LIMITE) {
						System.out.printf("Estes são os valores da %d° matriz!",x+1);
						System.out.println();
						
						for(coluna = 0;coluna < LIMITE;coluna++) {
							for(linha = 0;linha < LIMITE;linha++) {
								if(x == 0)
								{
									
									System.out.print("[" +matriz1[coluna][linha]+"]");
									
								}
								else
								{
									System.out.print("[" +matriz2[coluna][linha]+"]");
								}
								
							}	
							System.out.println();
							
						}
						
						x++;
					}
					
					
					break;
				}
				case '4': {
					System.out.println("Você escolheu a opção 4\nAs matrizes estão assim atualmente: ");
					x = 0;
					while(x < LIMITE) {
						System.out.printf("Estes são os valores da %d° matriz!",x+1);
						System.out.println();
						
						for(coluna = 0;coluna < LIMITE;coluna++) {
							for(linha = 0;linha < LIMITE;linha++) {
								if(x == 0)
								{
									
									System.out.print("[" +matriz1[coluna][linha]+"]");
									
								}
								else
								{
									System.out.print("[" +matriz2[coluna][linha]+"]");
								}
								
							}	
							System.out.println();
							
						}
						
						x++;
					}
					
					break;
				}
				case '5': {
					System.out.println("Você escolheu a opção 5\nAgora saira do programa obrigado pelo acesso!");
					opcao = 5;
					break;
				}
				
				default:
					System.out.println("\nResposta Invalida,Tente novamente!\n");
			}
			
			System.out.println();
			
		}while(opcao != 5);
	}

}
