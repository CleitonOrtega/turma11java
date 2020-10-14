package classes;

public class classeEletronico {

	public String modeloPc[] = {"JESS-9000","CO-1000","ED-5000"};
	public int valorPc[] = {1000,1500,2000};
	
	public void imprimirModeloEValor() {
		for(int x = 0;x < 3; x++) {
			System.out.printf("O modelo do computador é: %s",modeloPc[x]);
			System.out.printf("\nE o valor deste modelo é: %d",valorPc[x]);
			System.out.println();
			System.out.println();
		}
	}
	
}
