package loop;

public class Exercicio_10 {
	public static void main(String[] args) {
		int soma = 0;
		for (int c = 1; c < 21; ++c) {
			if (c % 3 == 0|| c % 5 == 0) {
				soma = soma + c;
			}
		}
		System.out.println("Soma: "+ soma);
	}
}
