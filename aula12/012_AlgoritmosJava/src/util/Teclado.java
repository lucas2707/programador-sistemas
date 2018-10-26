package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teclado {

	/**
	 * Objeo que representa o teclado
	 */

	private static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

	public static String lerTexto(String texto) {
		try {

			// Show the text
			System.out.println(texto);

			// Read the line
			return teclado.readLine();

		} catch (IOException e) {
			return null;
		}
	}

	public static int lerInt(String texto) {
		// Chama o m�todo lerString e converte o resultado

		// para inteiro
		return Integer.parseInt(lerTexto(texto));
	}

	public static double lerDouble(String texto) {
		// Chama o m�todo String e converte o resultado
		// resultado para double
		return Double.parseDouble(lerTexto(texto));

	}

}
