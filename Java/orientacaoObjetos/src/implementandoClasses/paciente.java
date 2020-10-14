package implementandoClasses;

import classes.classePaciente;

public class paciente {

	public static void main(String[] args) {
		classePaciente Paciente = new classePaciente();
		
		Paciente.nomePaciente("Felipe Ortega dos Santos");
		Paciente.doenca("Alergias");
		Paciente.anoNasc(2010);
		
		
		System.out.printf("O nome do paciente é: %s",Paciente.saidaNomePaciente());
		System.out.printf("\nO motivo de ter vindo no hospital é: %s",Paciente.saidaDoenca());
		System.out.printf("\nA idade do %s é %d",Paciente.saidaNomePaciente(),Paciente.saidaIdade());

	}

}
