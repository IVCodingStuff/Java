package condiconais;

public class ex_002 {

	public static void main(String[] args) {
		int c = 0;
		while (c  <= 99){
			c = ++c;
			if (c % 2 != 0) { 
			System.out.println(c);
			}
		}
	}
}
