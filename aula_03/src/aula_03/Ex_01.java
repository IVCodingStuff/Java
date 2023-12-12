package aula_03;

public class Ex_01 {
	public static void main(String[] args) {
		int conjunto_a[] = new int [10];
		int conjunto_b[] = new int [10];
		int conjunto_c[] = new int [10];
		int conjunto_d[] = new int [10];
		for (int c = 0; c < conjunto_a.length; ++c) {
			conjunto_a [c] = c+1;
		}
		for (int c = 0; c < conjunto_a.length; ++c) {
			System.out.print(conjunto_a[c]+" ");
		}
	
		for (int c = 0; c < conjunto_b.length; ++c) {
			conjunto_b[c] = c*c;
		}
		for (int c = 0; c < conjunto_b.length; ++c) {
			System.out.print(conjunto_b[c]+" ");
		}
		
		for (int c = 0; c < conjunto_c.length; ++c) {
			if (c < 6) {
				conjunto_c [c] = c;
			}
			else{
				c = 1;
				conjunto_c [c] = c*10;
			}
		}
		for (int c = 0; c < conjunto_c.length; ++c) {
			System.out.print(conjunto_c[c]);
		}
		for (int c = 3; c < conjunto_d.length; ++c) {
			conjunto_d[1] =3;
			if (c % 2 == 0) {
				conjunto_d [c+1] =  3 + c; 
			}
		}
		for (int c = 0; c < conjunto_d.length; ++c) {
			System.out.print(conjunto_d[c]);
		}
		 
	}
}
