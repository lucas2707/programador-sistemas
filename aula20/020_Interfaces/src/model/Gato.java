package model;

public class Gato implements Animal {

	private String nome;

	public Gato(String nome) {

		this.nome = nome;
	}

	@Override
	public String seuNome() {

		return nome;
	}

	@Override
	public String seuBarulho() {

		return "Miau! Miau!";
	}

}
