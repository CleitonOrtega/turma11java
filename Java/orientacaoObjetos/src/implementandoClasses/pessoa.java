package implementandoClasses;

import classes.classePessoa;

public class pessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classePessoa Pessoa = new classePessoa();
		classePessoa Pessoa1 = new classePessoa();
		classePessoa Pessoa2 = new classePessoa();
		
		Pessoa.setNome("Felipe Ortega dos santos");
		Pessoa.setEndereco("Rua José da Costa Gavião,305");
		Pessoa.setTelefone("Sem está informação!");
		
		Pessoa1.setNome("Cleiton Ortega dos Santos");
		
		Pessoa2.setNome("Luzia Ortega");
		Pessoa2.setEndereco(Pessoa.getEndereco());
		
		System.out.println("Dados Cadastrados!");
		System.out.println();
		
		System.out.println("Dados Pessoa 1");
		System.out.println(Pessoa.getNome());
		System.out.println(Pessoa.getEndereco());
		System.out.println(Pessoa.getTelefone());
		
		System.out.println();
		System.out.println("Dados Pessoa 2");
		System.out.println(Pessoa1.getNome());
		System.out.println("Sem informações restantes!");
		
		System.out.println();
		System.out.println("Dados Pessoa 3");
		System.out.println(Pessoa2.getNome());
		System.out.println(Pessoa2.getEndereco());
		System.out.println(Pessoa.getTelefone());
		
	}

}
