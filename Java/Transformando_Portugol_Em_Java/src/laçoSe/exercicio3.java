package laçoSe;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		 int idade;
		System.out.print("Digite sua idade: ");
		idade = tec.nextInt();
		if (idade < 10){
			System.out.print("Sua idade é inferior a 10 você não possui uma categoria");
		}
		else if(idade <= 14){
			System.out.println("Sua categoria é Infantil você possui " + idade + " anos");
		}
		else if(idade <= 17){
			System.out.println("Sua categoria é Juvenil você possui " + idade + " anos");
		}
		else if(idade <= 25){
			System.out.println("Sua categoria é Adulto você possui " + idade + " anos");
		}
		else{
			System.out.println("Sua categoria é Superior a Adulto você possui " + idade + " anos");
			}
		 
		
		tec.close();
	}

}
