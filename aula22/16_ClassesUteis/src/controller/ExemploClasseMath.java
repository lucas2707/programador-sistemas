package controller;

public class ExemploClasseMath {

	public static void main(String[] args) {
		double valSorteado = Math.random();
		int resultado = 50 + (int) (valSorteado * 30);
		System.out.println("Sorteado entre 50 e 80: " + resultado);

		// Sorteando a mega-sena
		for (int i = 0; i < 6; i++) {
			double numeroSena = Math.random();
			int numeroSorteado = (int) (numeroSena * 61);
			System.out.println("N�mero Sorteado: " + numeroSorteado);

		}

		// Maior entre dois n�meros
		int maior;
		maior = Math.max(resultado, 65);
		System.out.println("Entre 65 e " + resultado + " o maior valor � " + maior);

		// �rea de um c�rculo de raio 5
		double area = Math.PI * Math.pow(5, 2);
		System.out.println("�rea de um circulo de " + "raio 5 � " + area);

	double sen, cos, tan;
	double a = 60;
	sen = Math.sin(Math.toRadians(a));
	cos = Math.cos(Math.toRadians(a));
	tan = Math.tan(Math.toRadians(a));
	
	System.out.println("Seno: " +sen);
	System.out.println("Cosseno: " +cos);
	System.out.println("Tangente: " +tan);
	
	double raiz = Math.sqrt(4);
	System.out.println("Ra�z quadrada de 4 �: " +raiz);
	
	
	}
}
