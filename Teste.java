package br.com.palindromo.teste;

import java.util.Scanner;

import br.com.palindromo.Pilha;

public class Teste {

	public static void main(String[] args) {
		
		
		String palindromo;
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira a palavra: ");
		palindromo = scan.next();
		
		if(testaPalindromo(palindromo)) {
			
			System.out.println("É palindromo!");
		}else {
			
			System.out.println("Não é palindromo :(");
		}
		
		

	}

	
	public static boolean testaPalindromo(String palindromo) {
		
		Pilha<Character> pilha = new Pilha<>();
		
		for (int i = 0; i < palindromo.length(); i++) {
			
			pilha.empilha(palindromo.charAt(i));
		}
		
		String inverso = "";
		
		while(!pilha.estaVazia()) {
			
			inverso += pilha.desempilha();
		}
		
		if(inverso.equalsIgnoreCase(palindromo)) {
			
			return true;
		} else {
			
			return false;
		}
		
	}
}
