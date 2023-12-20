package Polimorfismo;

public class Vaca extends Mamifero{
	public Vaca(String nome, String especie, String cor) {
		super(nome, especie, cor);
	}
	public void emitirSom(){
		System.out.println("Muuuuuuu");
	}
	public void ruminar(){
		System.out.println("Comendo...");
	}
}
