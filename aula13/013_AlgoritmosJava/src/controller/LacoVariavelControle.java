package controller;

import util.Teclado;

public class LacoVariavelControle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r, x, i;

		for (i = 1; i <= 5; i++) {

			x = Teclado.lerInt("Digite o valor:");
			r = x * 3;
			System.out.println(r);

		}
	}

}
