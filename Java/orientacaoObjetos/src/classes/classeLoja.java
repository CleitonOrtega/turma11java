package classes;

import java.util.Collection;
import java.util.ArrayList;

public class classeLoja {

	Collection<String> estoque = new ArrayList();
	
	private String nomeLoja = "Ortega Sports";
	private int numEstoque;

	
	
	public classeLoja() {
		super();
	}
	public classeLoja(String estoque) {
		
	}

	public String getNomeLoja() {
		return nomeLoja;
	}
	
	public void adicionarRoupas(String addRoupas) {
		estoque.add(addRoupas);
	}
	
	public void getEstoque() {
		
		System.out.println(estoque);
		
	}
	
}
