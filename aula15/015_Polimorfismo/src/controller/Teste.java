package controller;

import model.ContaEspecial;
import model.ContaCorrente;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaCorrente cc = new ContaCorrente("Michael Oliveira", "0001", "123456", 250);
		System.out.println("Saldo Michael");
		System.out.println(cc.calcularSaldo());

		ContaEspecial cce = new ContaEspecial("Fabrício Curvello", "0034", "987654", 0.50, 500);
		System.out.println("Saldo Fabrício");
		System.out.println(cce.calcularSaldo());

	}

}
