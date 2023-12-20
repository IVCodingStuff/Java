package loop;

public class Exercicio_07 {
	public static void main(String[] args) {
		int quant = 0;
		for (int c = 1; c < 100; ++c) {
			if (c % 3 == 0) {
				System.out.println(c);
				quant = ++quant;
				}
			}
		System.out.println("O número de múltiplos encontrados é: "+ quant);
		
}
}
