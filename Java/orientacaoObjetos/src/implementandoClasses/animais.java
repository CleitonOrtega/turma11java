package implementandoClasses;

import classes.subClasseCachorroDeAnimal;
import classes.subClasseCavaloDeAnimal;
import classes.subClassePreguicaDeAnimal;

public class animais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		subClasseCachorroDeAnimal Cachorro = new subClasseCachorroDeAnimal("Pastor-Alem�o", 2015,"Late");
		subClasseCavaloDeAnimal Cavalo = new subClasseCavaloDeAnimal("Ponei",2000,"Relincha");
		subClassePreguicaDeAnimal Preguica = new subClassePreguicaDeAnimal("Pregui�a-De-Coleira",2010,"Som Desconhecido","Subir em �rvores");
		
		System.out.println("O animal em quest�o � : Cachorro!");
		System.out.println("A ra�a do cachorro �: "+Cachorro.getNomeRaca());
		System.out.println("Ele tem "+ Cachorro.calcIdade(Cachorro.getAnoNasc()) +" anos");
		System.out.println("O cachorro "+ Cachorro.getSomEmitido());
		System.out.println("E ele gosta de: "+Cachorro.getAcao());
		System.out.println();
		
		System.out.println("O animal em quest�o � : Cavalo!");
		System.out.println("A ra�a do cavalo �: "+Cavalo.getNomeRaca());
		System.out.println("Ele tem "+ Cavalo.calcIdade(Cavalo.getAnoNasc()) +" anos");
		System.out.println("O cavalo "+ Cavalo.getSomEmitido());
		System.out.println("E ele gosta de: "+Cavalo.getAcao());
		System.out.println();
		
		System.out.println("O animal em quest�o � : Pregui�a!");
		System.out.println("A ra�a da Pregui�a �: "+Preguica.getNomeRaca());
		System.out.println("Ele tem "+ Preguica.calcIdade(Preguica.getAnoNasc()) +" anos");
		System.out.println("A Pregui�a emite um "+ Preguica.getSomEmitido());
		System.out.println("E ele gosta de: "+Preguica.getManeiraDeAgir());
	}

}
