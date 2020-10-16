package classes;

public class classeAnimal {

	final int ANO = 2020;
	
	private String nomeRaca;
	private int anoNasc;
	private String somEmitido;
	private String acao = "Correr";
	
	//Constructor
	public classeAnimal(String nomeRaca, int anoNasc, String somEmitido) {
		this.nomeRaca = nomeRaca;
		this.anoNasc = anoNasc;
		this.somEmitido = somEmitido;
	}
	
	public classeAnimal(String nomeRaca, int anoNasc, String somEmitido, String acao) {
		super();
		this.nomeRaca = nomeRaca;
		this.anoNasc = anoNasc;
		this.somEmitido = somEmitido;
		this.acao = acao;
	}




	//Getters and Seters
	public String getNomeRaca() {
		return nomeRaca;
	}

	public void setNomeRaca(String nomeRaca) {
		this.nomeRaca = nomeRaca;
	}

	public int getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}

	public String getSomEmitido() {
		return somEmitido;
	}

	public void setSomEmitido(String somEmitido) {
		this.somEmitido = somEmitido;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String Acao) {
		this.acao = Acao;
	}
	
	public int calcIdade(int anoNasc) {
		return (ANO - anoNasc);
	}
	
	
	
	
}
