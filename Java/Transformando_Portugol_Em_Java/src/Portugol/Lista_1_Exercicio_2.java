package Portugol;

import java.util.Scanner;

public class Lista_1_Exercicio_2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int diaUsuario,diaCalculo = 0,anoCalculo = 0,mesCalculo = 0,diaResto;
		boolean testeMes = false, testeAno = false;
		
		System.out.println("digite sua idade em dias: ");
		diaUsuario = leia.nextInt();
		
		while(diaUsuario >= 365)
		{
			anoCalculo +=1;
			diaUsuario -=365;
			}
		while(diaUsuario >=30){
			mesCalculo +=1;
			diaUsuario -=30		;	
			}
		diaCalculo = diaUsuario;
		System.out.println("sua idade é "+ anoCalculo +" anos, "+ mesCalculo +" meses e "+ diaCalculo+ " dias");
		
		
		leia.close();

	}

}
