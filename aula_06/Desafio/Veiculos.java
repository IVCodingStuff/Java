package Desafio;
public class Veiculos {
	public String modelo;
	public int ano_lancamento;
	public String cor;
	
	public Veiculos (String modelo,int ano_lancamento,String cor) {
		this.modelo = modelo;
		this.ano_lancamento = ano_lancamento;
		this.cor = cor;
	}
	public void locomover() {
		System.out.println("Andou");
	}
}