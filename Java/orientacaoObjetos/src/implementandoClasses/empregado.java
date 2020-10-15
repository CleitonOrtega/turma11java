package implementandoClasses;

import classes.subClasseEmpregadoDePessoa;

import classes.classePessoa;

public class empregado {

	public static void main(String[] args) {
		

		classePessoa Pessoa = new classePessoa();
		subClasseEmpregadoDePessoa Emp =  new subClasseEmpregadoDePessoa(Pessoa.getNome(),Pessoa.getEndereco(),Pessoa.getTelefone(), 1000,2500,10);
		
		Pessoa.setNome("Cleiton Ortega dos Santos");
		Pessoa.setEndereco("Rua José da Costa Gavião,305");
		Pessoa.setTelefone("(11) 98053-9885");
		
		System.out.printf("O nome da pessoa é: %s",Pessoa.getNome());
		System.out.printf("\nO endereço dele é: %s",Pessoa.getEndereco());
		System.out.printf("\nO telefone dele é: %s",Pessoa.getTelefone());
		
		System.out.println("\nInformações da empresa!");
		System.out.printf("O código do setor é: %d",Emp.getCodigoSetor());
		System.out.printf("\nO salario base é: %.2f",Emp.getSalarioBase());
		System.out.printf("\nO salario base com descontos fica: %.2f",Emp.calcularSalario(Emp.getSalarioBase(), Emp.getImposto()));
		
		
	}

}
