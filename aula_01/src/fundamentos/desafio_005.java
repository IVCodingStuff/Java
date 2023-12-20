package fundamentos;

import java.util.Scanner;

public class desafio_005 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Insira M ou F: ");
		char letra = input.nextLine().charAt(0);
		if (letra == 'F') {
			System.out.println("F - Feminino");
		}
		else if (letra == 'M') {
			System.out.println("M - Masculino");
		}
		else {
			System.out.println("Valor inválido");
		}

	}

}
