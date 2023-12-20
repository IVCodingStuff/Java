package loop;

import java.util.Scanner;

public class Exercicio_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos alunos tem na sua sala?");
		int alunos = input.nextInt();
		float media = 0;
		for (int c = 0; c < alunos; ++c){
			System.out.println("Nota do "+ c +" aluno: ");
			float nota = input.nextInt();	
			media = media + nota;
		}
		media = media/alunos;
		System.out.println("Média da sala: "+ media);
	}
}
