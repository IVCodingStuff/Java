package fundamentos;

import java.util.Scanner;

public class desafio_002 {;

	public static void main(String[] args) {	
		Scanner numero1 = new Scanner(System.in);
		System.out.println("Insira um número: ");
		int resp1 = numero1.nextInt();
		Scanner numero2 = new Scanner(System.in);
		System.out.println("Insira um número: ");
		int resp2 = numero2.nextInt();
		Scanner numero3 = new Scanner(System.in);
		System.out.println("Insira um número: ");
		int resp3 = numero3.nextInt();
	
		if (resp1 > resp2 && resp1 > resp3){
			
			System.out.println (resp1 + " é o maior número");
		}
		else if (resp2 > resp1 && resp2 > resp3){
			
			System.out.println(resp2 + " é o maior número");
		}
		else if(resp3 > resp2 && resp3 > resp1){
			System.out.println(resp3 + " é o maior número");
		}
		if (resp1 < resp2 && resp1 < resp3){
			
			System.out.println (resp1 + " é o menor número");
		}
		else if (resp2 < resp1 && resp2 < resp3){
			
			System.out.println(resp2 + " é o menor número");
		}
		else if(resp3 < resp2 && resp3 < resp1){
			System.out.println(resp3 + " é o menor número");
		}

	}

}
