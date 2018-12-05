package controller;

public class EscopoDeVariavel {
	static int x = 2;// vari�vel global

	public static void metodoA() {

		int x = 25;
		System.out.println("Variavel local x ao entrar no metodoA � " + x);
		x = x + 1;
		System.out.println("Variavel local x antes do sair do metodoA � " + x);

	}

	public static void metodoB() {

		System.out.println("Variavel local x ao entrar no metodoB � " + x + " global.");
		x = x * 10;
		System.out.println("Variavel local x antes do sair do metodoB � " + x);

	}

	public static void metodoB(int x) {

		System.out.println("Variavel local x ao entrar no metodoB � " + x + " global.");
		x = x * 30;
		System.out.println("Variavel local x antes do sair do metodoB � " + x);

	}

	public static void main(String[] args) {
		metodoA();
		metodoB();
		int x = 5;
		System.out.println("x no in�cio de main � ()" + x);
		metodoA();
		metodoB();
		metodoB(x);

	}

}
