package lacoSe;
import java.util.Scanner;
public class primeiroSe {
	public static void main(String[] args)
	
	{	
		Scanner leia = new Scanner(System.in);
		int anoNasc,idade;
		char sexo, chefe;
		String nome;
		
		System.out.print("Digite seu nome: ");
		nome = leia.next();
		System.out.print("Digite seu ano de Nascimento: ");
		anoNasc = leia.nextInt();
		System.out.print("Digite seu sexo Masculino ou Feminino: M ou F ");
		sexo = leia.next().toUpperCase().charAt(0);
		System.out.print("Voc� � chefe(a) de fam�lia: S ou N");
		chefe = leia.next().toUpperCase().charAt(0);
		idade = 2020-anoNasc;
				
		if((sexo == 'M' || sexo == 'm') && (idade >= 18) && (chefe == 'S' || chefe == 's')  ){
			System.out.printf("Ol� %s , sua idade � %d voc� � do sexo Masculino e chefe de familia\\nTem direito aos R$600", nome, idade);
						;
		}else if( sexo == 'F' || sexo == 'f' && (idade >= 18) && (chefe == 'S' || chefe == 's') ){
			System.out.printf("Ol� %s , sua idade � %d voc� � do sexo feminino e chefa de familia\\nTem direito aos R$1.200", nome, idade);
		}
		
		else { System.out.println("Ent�o voc� n�o tem direito...");}
		
		leia.close();
	}
}