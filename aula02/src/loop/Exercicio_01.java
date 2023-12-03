package loop;

import java.util.Scanner;

public class Exercicio_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos alunos tem na sua sala?");
		int alunos = input.nextInt();
		int c = 0;
		float media = 0;
		while (c < alunos){
			c = ++c;
			System.out.println("Nota do "+ c +"º aluno: ");
			float nota = input.nextInt();	
			media = media + nota;
		}
		media = media/alunos;
		System.out.println("Média da sala: "+ media);
	}
}
