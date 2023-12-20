package condiconais;

import java.util.Scanner;

public class ex_008 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Insira um número: ");
		int numero = input.nextInt();
		for (int c = 1; c <= 10; c = c + 1) {
			if (numero % 2 == 0) {
				numero = numero/2;
			}
			if (numero %2 != 0) {
				numero = 3* numero +1;
			}
			System.out.println(numero);
			}

	}

}
