package controller;

import model.Pessoa;

public class Cadastro {

	public static void main(String [] args) {
		Pessoa people = new Pessoa ();
		
		people.setNome ("Maria Antonia");
		people.setIdade(4);
		people.setSexo("Feminino");
		
		System.out.println("Nome: " + people.getNome() );
		System.out.println("Idade: " + people.getIdade() );
		System.out.println("Sexo: " + people.getSexo() );
	}
}
