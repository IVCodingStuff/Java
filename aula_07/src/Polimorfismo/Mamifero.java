package Polimorfismo;

public class Mamifero extends Animais{
	public Mamifero(String nome, String especie, String cor) {
		super(nome, especie, cor);
	}
	public void mamar() {
		System.out.println("Mamou");
	}
}
