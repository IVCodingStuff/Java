package Animal_Estimação;

public class Calculo {
	public static void main(String[] args) {
		int base = 20;
		int altura = 20;
		
	Retangulo r1 = new Retangulo(base, altura);
	
		r1.setAltura(altura);
		r1.setBase(base);
		
		double area = r1.area();
		System.out.println(area);
}
	}
