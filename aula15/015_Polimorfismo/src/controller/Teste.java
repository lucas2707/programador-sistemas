package controller;

import model.ContaEspecial;
import model.ContaCorrente;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaCorrente cc = new ContaCorrente("Michael Oliveira", "0001", "123456", 250);
		System.out.println("Saldo Michael");
		System.out.println(cc.calcularSaldo());

		ContaEspecial cce = new ContaEspecial("Fabr�cio Curvello", "0034", "987654", 0.50, 500);
		System.out.println("Saldo Fabr�cio");
		System.out.println(cce.calcularSaldo());

	}

}