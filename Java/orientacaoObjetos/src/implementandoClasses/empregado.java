package implementandoClasses;

import classes.subClasseEmpregadoDePessoa;

import classes.classePessoa;

public class empregado {

	public static void main(String[] args) {
		

		classePessoa Pessoa = new classePessoa();
		subClasseEmpregadoDePessoa Emp =  new subClasseEmpregadoDePessoa(Pessoa.getNome(),Pessoa.getEndereco(),Pessoa.getTelefone(), 1000,2500,10);
		
		Pessoa.setNome("Cleiton Ortega dos Santos");
		Pessoa.setEndereco("Rua Jos� da Costa Gavi�o,305");
		Pessoa.setTelefone("(11) 98053-9885");
		
		System.out.printf("O nome da pessoa �: %s",Pessoa.getNome());
		System.out.printf("\nO endere�o dele �: %s",Pessoa.getEndereco());
		System.out.printf("\nO telefone dele �: %s",Pessoa.getTelefone());
		
		System.out.println("\nInforma��es da empresa!");
		System.out.printf("O c�digo do setor �: %d",Emp.getCodigoSetor());
		System.out.printf("\nO salario base �: %.2f",Emp.getSalarioBase());
		System.out.printf("\nO salario base com descontos fica: %.2f",Emp.calcularSalario(Emp.getSalarioBase(), Emp.getImposto()));
		
		
	}

}
