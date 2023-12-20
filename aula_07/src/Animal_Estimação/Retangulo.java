package Animal_Estimação;

public class Retangulo {
	private double altura;
	private double base;

	public Retangulo(double altura, double base) {
		this.base = base;
		this.altura = altura;
	}
	public double area(){
		double area = base*altura;
		return area;
	}
	
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	public double area(double base, double altura) {
		return base * altura;
	}public Retangulo(){
		
	}
}