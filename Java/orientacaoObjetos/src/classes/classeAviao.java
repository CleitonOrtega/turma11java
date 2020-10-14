package classes;

public class classeAviao {

		public String nomePais;
		public double valorPassagem;
		public double valorDesconto;
			
		public void entradaPais(String nome) {
			nomePais = nome;
		}
		public String saidaPais() {
			return nomePais;
		}
		
		public void entradaValorCompra(double valor) {
			valorPassagem = valor;
		}
		
		public double saidaValorCompra() {
			
			return valorPassagem;
			
		}
		
	public  void valorDesconto (double valor) {
			
			this.valorPassagem = valorPassagem * valor;
			
		}
		
	
	
}
