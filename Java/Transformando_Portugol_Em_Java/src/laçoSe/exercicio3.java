package la�oSe;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		 int idade;
		System.out.print("Digite sua idade: ");
		idade = tec.nextInt();
		if (idade < 10){
			System.out.print("Sua idade � inferior a 10 voc� n�o possui uma categoria");
		}
		else if(idade <= 14){
			System.out.println("Sua categoria � Infantil voc� possui " + idade + " anos");
		}
		else if(idade <= 17){
			System.out.println("Sua categoria � Juvenil voc� possui " + idade + " anos");
		}
		else if(idade <= 25){
			System.out.println("Sua categoria � Adulto voc� possui " + idade + " anos");
		}
		else{
			System.out.println("Sua categoria � Superior a Adulto voc� possui " + idade + " anos");
			}
		 
		
		tec.close();
	}

}
