package implementandoClasses;

import classes.classeFuncionario;

public class funcionario {

	public static void main(String[] args) {
		
		classeFuncionario Funcionario = new classeFuncionario();
		
		Funcionario.entradaNome("Cleiton Ortega dos Santos");
		Funcionario.entradaIdade(19);
		Funcionario.entradaSalario(4789.10);
		
		System.out.printf("Nome: %s",Funcionario.saidaNome());
		System.out.printf("\nMinha idade é: %d",Funcionario.saidaIdade());
		System.out.printf("\nMeu salario é: %.2f",Funcionario.saidaSalario());

	}

}
