package controller;

import util.Teclado;

public class DesvioCondicionalComposto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c;
		a = Teclado.lerInt("Informe o primeiro valor:");
		b = Teclado.lerInt("Informe o segundo valor:");
		c = a + b;
		
		if (c >= 10) {
			
		System.out.println("O resultado acrescido de 5 �:" + (c + 5));
		} else {
		System.out.println("O resultado subtra�do de 7 �: " + (c - 7));
	}
	}
}
