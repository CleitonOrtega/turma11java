package entidades;

import java.util.Scanner;

public class instaciandoProfessores {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		professores professor1 = new professores();
		professores professor2 = new professores();
		professores professor3 = new professores();
		alunos aluno1 = new alunos();
		alunos aluno2 = new alunos();
		alunos aluno3 = new alunos();
		int x = 0;
		
		do {
			
			if(x == 0) {
				System.out.printf("Digite o nome do(a) %d° professor(a): " , x+1);
				professor1.nomeProf = leia.next();
				System.out.printf("Digite a materia do(a) %s: ",professor1.nomeProf);
				professor1.materiaProf = leia.next();
				System.out.printf("Digite a idade do(a) %s: ",professor1.nomeProf);
				professor1.idadeProf = leia.nextInt();
				System.out.printf("Digite o sexo do(a) %s: ",professor1.nomeProf);
				professor1.sexo = leia.next().toUpperCase().charAt(0);
			
			}
			else if(x == 1) {
				System.out.printf("Digite o nome do(a) %d° professor(a): " , x+1);
				professor2.nomeProf = leia.next();
				System.out.printf("Digite a materia do(a) %s: ",professor2.nomeProf);
				professor2.materiaProf = leia.next();
				System.out.printf("Digite a idade do(a) %s: ",professor2.nomeProf);
				professor2.idadeProf = leia.nextInt();
				System.out.printf("Digite o sexo do(a) %s: ",professor2.nomeProf);
				professor2.sexo = leia.next().toUpperCase().charAt(0);
			}else {
				System.out.printf("Digite o nome do(a) %d° professor(a): " , x+1);
				professor3.nomeProf = leia.next();
				System.out.printf("Digite a materia do(a) %s: ",professor3.nomeProf);
				professor3.materiaProf = leia.next();
				System.out.printf("Digite a idade do(a) %s: ",professor3.nomeProf);
				professor3.idadeProf = leia.nextInt();
				System.out.printf("Digite o sexo do(a) %s: ",professor3.nomeProf);
				professor3.sexo = leia.next().toUpperCase().charAt(0);
			}
			
			
		x++;
		}while(x < 3);
			x = 0;
		
		do {
			
			if(x == 0) {
				System.out.printf("\nO nome do %d° professor é %s e ele aplica a matéria de: %s", x+1,professor1.nomeProf,professor1.materiaProf);
				System.out.printf("\nEle tem nome %d anos e é do sexo %s", professor1.idadeProf,professor1.sexo);
			}
			else if(x == 1) {
				System.out.printf("\n\nO nome do %d° professor é %s e ele aplica a matéria de: %s", x+1,professor2.nomeProf,professor2.materiaProf);
				System.out.printf("\nEle tem %d anos e é do sexo %s", professor2.idadeProf,professor2.sexo);
			}
			else {
				System.out.printf("\n\nO nome do %d° professor é %s e ele aplica a matéria de: %s", x+1,professor3.nomeProf,professor3.materiaProf);
				System.out.printf("\nEle tem %d anos e é do sexo %s", professor3.idadeProf,professor3.sexo);
			}
			x++;
		}while(x < 3);
		
		x = 0;
		
do {
			
			if(x == 0) {
				System.out.printf("Digite o nome do(a) %d° Aluno(a): " , x+1);
				aluno1.nomeAluno = leia.next();
				System.out.printf("Digite o curso do(a) %s: ",aluno1.curso);
				aluno1.curso = leia.next();
				System.out.printf("Digite o ano de Nascimento do(a) %s: ",aluno1.nomeAluno);
				aluno1.anoNasc = leia.nextInt();
				System.out.printf("Digite o sexo do(a) %s: ",aluno1.sexo);
				aluno1.sexo = leia.next().toUpperCase().charAt(0);
				System.out.println("Digite a nota média: ");
				aluno1.notaGeral = leia.nextDouble();
			
			}
			else if(x == 1) {
				System.out.printf("Digite o nome do(a) %d° Aluno(a): " , x+1);
				aluno2.nomeAluno = leia.next();
				System.out.printf("Digite o curso do(a) %s: ",aluno2.nomeAluno);
				aluno2.curso = leia.next();
				System.out.printf("Digite o ano de Nascimento do(a) %s: ",aluno2.nomeAluno);
				aluno2.anoNasc = leia.nextInt();
				System.out.printf("Digite o sexo do(a) %s: ",aluno2.sexo);
				aluno2.sexo = leia.next().toUpperCase().charAt(0);
				System.out.println("Digite a nota média: ");
				aluno2.notaGeral = leia.nextDouble();
			}else {
				System.out.printf("Digite o nome do(a) %d° Aluno(a): " , x+1);
				aluno3.nomeAluno = leia.next();
				System.out.printf("Digite o curso do(a) %s: ",aluno3.nomeAluno);
				aluno3.curso = leia.next();
				System.out.printf("Digite o ano de Nascimento do(a) %s: ",aluno3.nomeAluno);
				aluno3.anoNasc = leia.nextInt();
				System.out.printf("Digite o sexo do(a) %s: ",aluno3.sexo);
				aluno3.sexo = leia.next().toUpperCase().charAt(0);
				System.out.println("Digite a nota média: ");
				aluno3.notaGeral = leia.nextDouble();
			}
			
			
		x++;
		}while(x < 3);
		
		x = 0;
		
		
do {
	
	if(x == 0) {
		System.out.printf("\nO nome do %d° aluno é %s e ele faz o curso de: %s", x+1,aluno1.nomeAluno,aluno1.curso);
		System.out.printf("\nEle tem %d anos e é do sexo %s",(2020 - aluno1.anoNasc),aluno1.sexo);
		System.out.printf("\nE a nota geral é: %.2f",aluno1.notaGeral);
	}
	else if(x == 1) {
		System.out.printf("\n\nO nome do %d° aluno é %s e ele faz o curso de: %s", x+1,aluno2.nomeAluno,aluno2.curso);
		System.out.printf("\nEle tem %d anos e é do sexo %s",(2020 - aluno2.anoNasc),aluno2.sexo);
		System.out.printf("\nE a nota geral é: %.2f",aluno2.notaGeral);
	}
	else {
		System.out.printf("\n\nO nome do %d° aluno é %s e ele faz o curso de: %s", x+1,aluno3.nomeAluno,aluno3.curso);
		System.out.printf("\nEle tem %d anos e é do sexo %s",(2020 - aluno3.anoNasc),aluno3.sexo);
		System.out.printf("\nE a nota geral é: %.2f",aluno3.notaGeral);
	}
	x++;
}while(x < 3);

		
		
		
		
		
		
		
		
leia.close();
	}

}
