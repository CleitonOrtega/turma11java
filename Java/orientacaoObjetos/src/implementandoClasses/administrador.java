package implementandoClasses;

import classes.classePessoa;

import classes.subClasseAdministradorDePessoa;

public class administrador {

	public static void main(String[] args) {

		classePessoa Pessoa = new classePessoa();
		subClasseAdministradorDePessoa Adm = new subClasseAdministradorDePessoa(Pessoa.getNome(), 1439.10);
		
		Pessoa.setNome("Cleiton Ortega dos Santos");
		
		System.out.printf("O nome do ADM é: %s",Pessoa.getNome());
		System.out.printf("\nA ajuda de custos é %.2f",Adm.getAjudaDeCusto());
		
	}

}
