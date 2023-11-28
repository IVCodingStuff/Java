package fundamentos;
import java.util.Scanner;

public class desafio_006 {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int c = 0;
			
			System.out.println("Telefonou para a vítima? [1 - Sim/2 - Não]: ");
			int resposta1 = input.nextInt();
			if (resposta1 == 1){
				++c;
			}
			
			
			
			System.out.println("Esteve no local do crime? [1 - Sim/2 - Não]: ");
			int resposta2 = input.nextInt();
			if (resposta2 == 1){
				++c;
			}
			
			System.out.println("Mora perto da vítima? [1 - Sim/2 - Não]: ");
			int resposta3 = input.nextInt();
			if (resposta3 == 1){
				++c;
			}

			System.out.println("Devia para a vítima? [1 - Sim/2 - Não]: ");
			int resposta4 = input.nextInt();
			if (resposta4 == 1){
				++c;
			}
			
			System.out.println("Já trabalhou com a vítima? [1 - Sim/2 - Não]: ");
			int resposta5 = input.nextInt();
			if (resposta5 == 1){
				++c;
			}

			System.out.println(c);
			
			
			if (c == 2) {
				System.out.println("Suspeito");
			}
			else if (c == 3 ||  c == 4) {
				System.out.println("Cúmplice");
			}
				
			else if (c == 5) {
				System.out.println("Assasino");
			}
			else {
				System.out.println("Inocente");
			}
		}
	}


