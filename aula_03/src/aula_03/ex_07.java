package aula_03;

import java.util.Scanner;

public class ex_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insira uma frase");
		String texto = input.nextLine();
		String maiusculo = texto.toUpperCase();
		System.out.println(maiusculo);
	}
}
