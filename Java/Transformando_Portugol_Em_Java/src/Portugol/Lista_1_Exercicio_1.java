package Portugol;

import java.util.Scanner;

public class Lista_1_Exercicio_1 {

	public static void main(String[] args) {
		/*
		 * programa
{
	

	funcao inicio()
	{
		
		
		
	}
}
		 */
		Scanner leia = new Scanner(System.in);
		int diaAtual,mesAtual,anoAtual,diaUsuario,mesUsuario,AnoUsuario,mesCalculo,anoCalculo,diaCalculo,diaFinal = 0;
		
		System.out.println("por favor insira os dados atuais de acordo com a recomenda��o");
		System.out.println("dia � hoje? (resposta em numero de 1 a 31): ");
		diaAtual = leia.nextInt();
		System.out.println("que mes � hoje? (resposta em numero de 1 a 12): ");
		mesAtual = leia.nextInt();
		System.out.println("que ano � hoje ? (resposta em numero de 4 casas decimais): ");
		anoAtual = leia.nextInt();
		System.out.println("primeira coleta efetuada com sucesso, por favor insera agora os dados de usuario");
		System.out.println("qual o dia do seu aniversario? (resposta em numero de 1 a 31): ");
		diaUsuario = leia.nextInt();
		System.out.println("que mes � do seu aniversario? (resposta em numero de 1 a 12): ");
		mesUsuario = leia.nextInt();
		System.out.println("que ano voc� nasceu? (resposta em numero de 4 casas decimais): ");
		AnoUsuario = leia.nextInt();
		if(mesAtual >= mesUsuario){
			mesCalculo = mesAtual-mesUsuario;
		}else{
			mesCalculo = mesUsuario-mesAtual;
		}
		anoCalculo = anoAtual-AnoUsuario;
		if(diaAtual>=diaUsuario){
			diaCalculo = diaAtual-diaUsuario;
		}else{
			diaCalculo = diaUsuario-diaAtual;
		}	
		diaFinal = diaCalculo + diaFinal;
		diaFinal += mesCalculo*30;
		diaFinal += anoCalculo*365;
		
		System.out.println("a idade em dias do usuario �: " + diaFinal );
		
		
		leia.close();
	}

}
