package loop;

public class loop2 {
	public static void main(String[] args) {
		for (int c = 1; c <100; c++) {
			if (c > 50 && c < 60) {
				continue;
		}
			System.out.println(c);
		}
	}
}
