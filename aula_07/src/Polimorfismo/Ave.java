package Polimorfismo;

public class Ave extends Animais{
	public Ave(String nome, String especie, String cor) {
			super(nome, especie, cor);
		}
	public void Voar() {
			System.out.println("Voou");
		}
	}
