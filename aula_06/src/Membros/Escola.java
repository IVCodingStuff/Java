package Membros;

import java.util.Date;

public class Escola {
	public static void main(String[] args) {
		Aluno a = new Aluno ("Isa","11555740448", new Date());
		System.out.println("Veja como os atributos foram preenchidos\n\nNome:" + a.nome);
		System.out.println("CPF: " + a.cpf);
		System.out.println("Data de Nascimento: "+ a.DataNascimento.toString());
	}
}
