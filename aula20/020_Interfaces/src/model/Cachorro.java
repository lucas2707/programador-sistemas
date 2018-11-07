package model;

public class Cachorro implements Animal {

	private String nome;

	public Cachorro(String nome) {
		this.nome = nome;
	}

	@Override
	public String seuNome() {

		return nome;
	}

	@Override
	public String seuBarulho() {

		return "Au! Au!";
	}

}
