package controller;

public class ExemploClasseMath {

	public static void main(String[] args) {
		double valSorteado = Math.random();
		int resultado = 50 + (int) (valSorteado * 30);
		System.out.println("Sorteado entre 50 e 80: " + resultado);

		//Sorteando a mega-sena
		for (int i = 0; i < 6; i++) {
			double numeroSena = Math.random();
			int numeroSorteado = (int) (numeroSena * 61);
			System.out.println("N�mero Sorteado: " + numeroSorteado);

		}
	}
}
