package fundamentos;

import java.util.Scanner;

public class desafio_002 {;

	public static void main(String[] args) {	
		Scanner numero1 = new Scanner(System.in);
		System.out.println("Insira um n�mero: ");
		int resp1 = numero1.nextInt();
		Scanner numero2 = new Scanner(System.in);
		System.out.println("Insira um n�mero: ");
		int resp2 = numero2.nextInt();
		Scanner numero3 = new Scanner(System.in);
		System.out.println("Insira um n�mero: ");
		int resp3 = numero3.nextInt();
	
		if (resp1 > resp2 && resp1 > resp3){
			
			System.out.println (resp1 + " � o maior n�mero");
		}
		else if (resp2 > resp1 && resp2 > resp3){
			
			System.out.println(resp2 + " � o maior n�mero");
		}
		else if(resp3 > resp2 && resp3 > resp1){
			System.out.println(resp3 + " � o maior n�mero");
		}
		if (resp1 < resp2 && resp1 < resp3){
			
			System.out.println (resp1 + " � o menor n�mero");
		}
		else if (resp2 < resp1 && resp2 < resp3){
			
			System.out.println(resp2 + " � o menor n�mero");
		}
		else if(resp3 < resp2 && resp3 < resp1){
			System.out.println(resp3 + " � o menor n�mero");
		}

	}

}
