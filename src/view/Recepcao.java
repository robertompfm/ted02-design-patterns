package view;

import model.Cliente;
import model.ClienteFeminino;
import model.ClienteMasculino;
import model.Genero;

public class Recepcao {
	
	private Cliente getCliente(Genero genero, String nome) {
		if (genero == Genero.MASCULINO) {
			return new ClienteMasculino(nome);
		} else if (genero == Genero.FEMININO) {
			return new ClienteFeminino(nome);
		} else {
			return new Cliente(nome);
		}
	}
	
	public void cumprimentarCliente(Genero genero, String nome) {
		Cliente cliente = getCliente(genero, nome);
		String cumprimento = cliente.getCumprimento();
		System.out.println(cumprimento);
	}
	
	public static void main(String[] args) {
		Recepcao recepcao = new Recepcao();
		recepcao.cumprimentarCliente(Genero.MASCULINO, "Rogerivaldo");
		recepcao.cumprimentarCliente(Genero.FEMININO, "Gesiscleide");
		recepcao.cumprimentarCliente(null, "Dani");
	}
}
