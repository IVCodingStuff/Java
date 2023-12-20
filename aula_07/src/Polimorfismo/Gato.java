package Polimorfismo;

public class Gato extends Mamifero{
	public Gato (String nome, String especie, String cor) {
		super (nome, especie, cor);
		}
	public void emitirSom() {
		System.out.println("Miaaaaaau");
	}	
	public void comer(){
		System.out.println("Comendo...");
	}
}
