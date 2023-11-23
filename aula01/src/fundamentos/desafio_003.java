package fundamentos;

import java.util.Scanner;

public class desafio_003 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o número do dia: ");
		int dia_semana = input.nextInt();
		
		if (dia_semana == 1) {
			System.out.println("1 - Domingo");
		}
		else if (dia_semana == 2){
			System.out.println("2 - Segunda");
		}
		else if (dia_semana == 3){
			System.out.println("3 - Terça");
		}
		else if (dia_semana == 4){
			System.out.println("4 - Quarta");
		}
		else if (dia_semana == 5){
			System.out.println("5 - Quinta");
		}
		else if (dia_semana == 6){
			System.out.println("6 - Sexta");
		}
		else if (dia_semana == 7){
			System.out.println("7 - Sabádo");
		}
		else {
			System.out.println("Valor inválido.");
		}
	}
		
}

