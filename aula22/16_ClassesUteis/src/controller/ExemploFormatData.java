package controller;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ExemploFormatData {

	public static void main(String[] args) {

		Date data = new Date();
		System.out.println("Data: " + data);

		@SuppressWarnings("deprecation")
		@Deprecated
		Date dataInserida = new Date(2011, 9, 14);
		System.out.println("Data Inserida: " + dataInserida);

		// Esta Classe está obsoleta

		Calendar data2 = new GregorianCalendar();
		System.out.println("Data: " + data2);

	}

}
