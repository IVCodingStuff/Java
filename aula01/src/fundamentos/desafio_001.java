package fundamentos;

import java.util.Scanner;

public class desafio_001 {
	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		System.out.print("Insira um numero:");
		int resp = numero.nextInt();
		System.out.println(resp > 0 ?("O numero digitado é positivo") : ("O numero digitado é negativo"));
		
	}
}
