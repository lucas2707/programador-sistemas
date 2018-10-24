package controller;

import util.Teclado;

public class Operadores {

	public static void main(String [] args) {
	
	String nome; 
	nome = Teclado.lerTexto("Digite seu nome:");
	
	int nota1, nota2, nota3, nota4;
	
	nota1 = Teclado.lerInt("Digite sua nota1:");
	nota2 = Teclado.lerInt("Digite sua nota2:");
	nota3 = Teclado.lerInt("Digite sua nota3:");
	nota4 = Teclado.lerInt("Digite sua nota4:");
		
	int media = nota1 + nota2 + nota3 + nota4;
    media = media/4;
	
	
	System.out.println("Nome informado: " + nome);
	System.out.println("Nota1 informada: " + nota1);
	System.out.println("Nota2 informada: " + nota2);
	System.out.println("Nota3 informada: " + nota3);
	System.out.println("Nota4 informada: " + nota4);
	System.out.println("Média informada: " + media);
	
	
}
	
}
