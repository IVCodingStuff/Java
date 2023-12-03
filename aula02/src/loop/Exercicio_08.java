package loop;

import java.util.Scanner;

public class Exercicio_08 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Insira um numero: ");
		int numero = input.nextInt();
		if (numero % 2 == 0) {
			numero = numero /2;
		}
		else {
			
			numero = 3 * numero + 1;
		}
		System.out.println(numero);
	}
}
