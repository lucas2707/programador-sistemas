package controller;

import util.Teclado;

public class DesvioCondicionalEncadeado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		nome = Teclado.lerTexto("Digite seu nome:");
		System.out.println("Nome informado:" + nome);
		
		double salario, salarioNovo;
		salario = Teclado.lerDouble("Indique o Salário:");
		if (salario < 500) {

			salarioNovo = salario * 1.20;

		} else {

			if (salario <= 1000) {

				salarioNovo = salario * 1.15;

			} else {

				if (salario < 2000) {
				
				salarioNovo = salario * 1.10;
				
			} else {
				
				salarioNovo = salario * 1.05;
			
			}
			}
		}
		System.out.println("O salário com reajuste é:" + salarioNovo);
	}
}
