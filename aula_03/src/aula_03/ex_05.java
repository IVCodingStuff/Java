package aula_03;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ex_05 {
	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.println("Escreva uma frase: ");
	String texto = input.nextLine();
	StringTokenizer exemplo = new StringTokenizer(texto);
	System.out.println("Palavras escritas: " + exemplo.countTokens());
	}
}
