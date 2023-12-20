package condiconais;

public class ex_003 {

	public static void main(String[] args) {
		int c = 0;
		while (c  <= 100){
			c = ++c;
			if (c % 2 == 0) { 
			System.out.println(c);
			}
		}
	}
}