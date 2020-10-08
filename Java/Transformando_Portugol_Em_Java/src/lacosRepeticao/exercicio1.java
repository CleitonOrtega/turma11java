package lacosRepeticao;

public class exercicio1 {

	public static void main(String[] args) {
		int num = 1000;
		
		System.out.println("Os numeros entre 1000 e 1999 que são divididos em 11 e se tem um resto de 5 são:");
		
		for(num = 1000;num < 2000;num++) {
			
			if(num%11 == 5) {
				
				System.out.printf("\n%d",num);
				
			}
		}

	}

}
