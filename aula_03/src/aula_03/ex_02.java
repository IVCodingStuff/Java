package aula_03;

import java.util.Scanner;

public class ex_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double conjunto_a[] = new double [10];
		double conjunto_b[] = new double [10];
		double soma = 0;
		for (int c = 1; c <= 5; c++) {
			System.out.println("Insira o " + c +" numero da lista:");
			conjunto_a[c] = input.nextDouble();
			conjunto_b[c] = conjunto_a[c]*2-1;
			soma = soma + (conjunto_a[c] + conjunto_b[c]);
		}
		System.out.print("Conjunto A: ");
		for (int c = 1; c <= 5; c++) {
			System.out.print(conjunto_a[c] + " ");
		}
		System.out.println(" ");
		System.out.print("Conjunto B: ");
		for (int c = 1; c <= 5; c++) {
			System.out.print(conjunto_b[c] + " ");
		}
		System.out.println(" ");
		System.out.print("Soma: ");
		System.out.println(soma);
	}
}
