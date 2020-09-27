package model;

public class ClienteFeminino extends Cliente {

	public ClienteFeminino(String nome) {
		super(nome);
	}

	@Override
	public String getCumprimento() {
		return "Bem vinda Sra." + getNome();
	}
	

}
