package loop;

public class Exercicio_04 {
	public static void main(String[] args) {
		int c = 0;
		while (c < 100){
			++c;
			if (c % 2 == 0){
				System.out.print(c + " ");
			}
		}
		
		System.out.println(" ");
		
		int d = 0;
		while (d < 100){
			++d;
			if (d % 2 != 0){
				System.out.print(d + " ");
			}
		}
		
	}
}
