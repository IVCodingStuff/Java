package fundamentos;

import java.util.Scanner;

public class desafio_006 {

		public static void main(String[] args) {
			Scanner input1 = new Scanner(System.in);
			System.out.println("Telefonou para a v�tima? [1 - Sim/2 - N�o]: ");
			int resposta1 = input1.nextInt();
			
			Scanner input2 = new Scanner(System.in);
			System.out.println("Esteve no local do crime? [1 - Sim/2 - N�o]: ");
			int resposta2 = input1.nextInt();
			
			Scanner input3 = new Scanner(System.in);
			System.out.println("Mora perto da v�tima? [1 - Sim/2 - N�o]: ");
			int resposta3 = input1.nextInt();
			
			Scanner input4 = new Scanner(System.in);
			System.out.println("Devia para a v�tima? [1 - Sim/2 - N�o]: ");
			int resposta4 = input1.nextInt();
			
			Scanner input5 = new Scanner(System.in);
			System.out.println("J� trabalhou com a v�tima? [1 - Sim/2 - N�o]: ");
			int resposta5 = input1.nextInt();
			int soma_res = resposta1 + resposta2 + resposta3 + resposta4 + resposta5;
			System.out.println(soma_res);
			if (soma_res == 8) {
				System.out.println("Suspeita");
			}
			else if (soma_res == 6 ||  soma_res == 7) {
				System.out.println("C�mplice");
			}
				
			else if (soma_res == 5) {
				System.out.println("Assasino");
			}
			else {
				System.out.println("Inocente");
			}
	}
}

