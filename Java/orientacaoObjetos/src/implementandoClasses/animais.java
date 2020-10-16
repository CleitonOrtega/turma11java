package implementandoClasses;

import classes.subClasseCachorroDeAnimal;
import classes.subClasseCavaloDeAnimal;
import classes.subClassePreguicaDeAnimal;

public class animais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		subClasseCachorroDeAnimal Cachorro = new subClasseCachorroDeAnimal("Pastor-Alemão", 2015,"Late");
		subClasseCavaloDeAnimal Cavalo = new subClasseCavaloDeAnimal("Ponei",2000,"Relincha");
		subClassePreguicaDeAnimal Preguica = new subClassePreguicaDeAnimal("Preguiça-De-Coleira",2010,"Som Desconhecido","Subir em Árvores");
		
		System.out.println("O animal em questão é : Cachorro!");
		System.out.println("A raça do cachorro é: "+Cachorro.getNomeRaca());
		System.out.println("Ele tem "+ Cachorro.calcIdade(Cachorro.getAnoNasc()) +" anos");
		System.out.println("O cachorro "+ Cachorro.getSomEmitido());
		System.out.println("E ele gosta de: "+Cachorro.getAcao());
		System.out.println();
		
		System.out.println("O animal em questão é : Cavalo!");
		System.out.println("A raça do cavalo é: "+Cavalo.getNomeRaca());
		System.out.println("Ele tem "+ Cavalo.calcIdade(Cavalo.getAnoNasc()) +" anos");
		System.out.println("O cavalo "+ Cavalo.getSomEmitido());
		System.out.println("E ele gosta de: "+Cavalo.getAcao());
		System.out.println();
		
		System.out.println("O animal em questão é : Preguiça!");
		System.out.println("A raça da Preguiça é: "+Preguica.getNomeRaca());
		System.out.println("Ele tem "+ Preguica.calcIdade(Preguica.getAnoNasc()) +" anos");
		System.out.println("A Preguiça emite um "+ Preguica.getSomEmitido());
		System.out.println("E ele gosta de: "+Preguica.getManeiraDeAgir());
	}

}
