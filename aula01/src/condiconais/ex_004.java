package condiconais;

import java.util.Scanner;

public class ex_004 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Insira um número: ");
		int numero = input.nextInt();
		int c = 0;
		while (c < numero) {
			c = ++c;
			if (c % 2 == 0){
				System.out.println(c);
			}
			if (c % 2 != 0){
				System.out.print(c + " // ");
			}	
		}
	}
}
