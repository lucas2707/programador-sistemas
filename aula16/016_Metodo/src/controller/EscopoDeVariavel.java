package controller;

public class EscopoDeVariavel {
	static int x = 2;// variável global

	public static void metodoA() {

		int x = 25;
		System.out.println("Variavel local x ao entrar no metodoA é " + x);
		x = x + 1;
		System.out.println("Variavel local x antes do sair do metodoA é " + x);

	}

	public static void metodoB() {

		System.out.println("Variavel local x ao entrar no metodoB é " + x + " global.");
		x = x * 10;
		System.out.println("Variavel local x antes do sair do metodoB é " + x);

	}

	public static void metodoB(int x) {

		System.out.println("Variavel local x ao entrar no metodoB é " + x + " global.");
		x = x * 30;
		System.out.println("Variavel local x antes do sair do metodoB é " + x);

	}

	public static void main(String[] args) {
		metodoA();
		metodoB();
		int x = 5;
		System.out.println("x no início de main é ()" + x);
		metodoA();
		metodoB();
		metodoB(x);

	}

}
