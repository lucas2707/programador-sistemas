package controller;

import model.Aluno;
import model.Professor;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno aluno1 = new Aluno("João Mendes Silva1", "10099876-5", "035568843-06", "21-8755-3456", "jmendes_silva@gmail.com", "10001", "Técnico de TI");
		Aluno aluno2 = new Aluno("João Mendes Silva2", "10099876-5", "035568843-06", "21-8755-3456", "jmendes_silva@gmail.com", "10001", "Técnico de TI");
		Aluno aluno3 = new Aluno("João Mendes Silva3", "10099876-5", "035568843-06", "21-8755-3456", "jmendes_silva@gmail.com", "10001", "Técnico de TI");
		
		System.out.println("Nome: " +aluno1.getNome());
		System.out.println("Nome: " +aluno2.getNome());
		System.out.println("Nome: " +aluno3.getNome());
		System.out.println("São: " +aluno1.getNumStudents() +"alunos registrados");
		
		Professor professor = new Professor("Marcelo Roberto Campos", "10054987-7", "075598845-75", "21-7793-8574","mrcampos@senai.rj.gov.br", "901", "TI");
		System.out.println("Nome do professor: " +professor.getNome());
		
	}

}
