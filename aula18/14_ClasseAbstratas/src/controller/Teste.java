package controller;

import model.*;

public class Teste {

	public static void main(String[] args) {

		// Usuario usu = new Usuario();
		Professor prof = new Professor("joaquim", "joaquim123", 0, "Joaquim da Silva", "Doutor", 1123);
		prof.mostrar();
		System.out.println("=================================================");

		Aluno aluno = new Aluno("muzi", "muzi123", 1, "Sergio Muzi", "primeiro", "tarde", 32115);
		aluno.mostrar();
		System.out.println("=================================================");
	}
}
