package condiconais;

import java.util.Scanner;

public class ex_001 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Quantos alunos tem na sua sala? ");
		int alunos = input.nextInt();
		int c = 0;
		float media = 0;
		while (c<alunos) {
			c = c + 1;
			System.out.println("Insira a nota do " + c +"º aluno: ");
			float notas = input.nextFloat();
			media = media + notas;
		}
		System.out.println("Média da sala: " + media);
	}

}
