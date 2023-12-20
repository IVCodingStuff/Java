package Polimorfismo;

public class Calculos {
	Calculadora somas = new Calculadora();
	double soma1 = somas.soma(10, 5);
	double soma2 = somas.soma(10, 5, 4);
	Calculadora multiplicacoes = new Calculadora();
	double multi1 = multiplicacoes.multiplicacao(10, 5);
	double multi2 = multiplicacoes.multiplicacao(10, 5, 10);
}
