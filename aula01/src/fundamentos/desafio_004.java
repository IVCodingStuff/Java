package fundamentos;

import java.util.Scanner;

public class desafio_004 {
	public static void main(String[] args) {
		Scanner input1 = new Scanner (System.in);
		System.out.println("Insira a 1º nota: ");
		float n1 = input1.nextFloat();
		Scanner input2 = new Scanner (System.in);
		System.out.println("Insira a 2º nota: ");
		float n2 = input1.nextFloat();
		float media =  (n1 + n2)/2;
		System.out.println(media);
		if  (media >= 7) {
			System.out.println("Aluno aprovado");
		}
		else if  (media <= 4) {
			System.out.println("Aluno reprovado");
		}
		else if  (media < 7 && media > 4) {
			System.out.println("Aluno em recuperação");
		}
	}
}
