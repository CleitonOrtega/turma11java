package classes;

public class subClasseAdministradorDePessoa extends classePessoa {

	private double ajudaDeCusto;
	
	public subClasseAdministradorDePessoa(String nome,double ajudaDeCusto) {
		super();
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
}
