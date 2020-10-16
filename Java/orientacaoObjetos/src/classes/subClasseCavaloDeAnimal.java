package classes;

public class subClasseCavaloDeAnimal extends classeAnimal {

	private String maneiraDeAgir ;
	
	public subClasseCavaloDeAnimal(String nomeRaca, int anoNasc, String somEmitido) {
		super(nomeRaca, anoNasc, somEmitido);
	}

	public subClasseCavaloDeAnimal(String nomeRaca, int anoNasc, String somEmitido,String acao) {
		super(nomeRaca, anoNasc, somEmitido,acao);
	}

	public String getManeiraDeAgir() {
		return maneiraDeAgir;
	}

	public void setManeiraDeAgir() {
		this.maneiraDeAgir = super.getAcao();
	}
	
}
