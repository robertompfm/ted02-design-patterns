package model;

public class ClienteMasculino extends Cliente {

	public ClienteMasculino(String nome) {
		super(nome);
	}

	@Override
	public String getCumprimento() {
		return "Bem vindo Sr." + getNome();
	}
	
	
	
	
}
