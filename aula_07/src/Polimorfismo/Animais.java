package Polimorfismo;

public class Animais {
	public String nome;
	public String especie;
	public String cor;
	public void comer(){
		System.out.println("Comeu");
	}
	public Animais(String nome, String especie, String cor) {
		this.nome = nome;
		this.especie = especie;
		this.cor = cor;
	}
	public void emitirSom(){
		System.out.println("Dale");
	}
	}
