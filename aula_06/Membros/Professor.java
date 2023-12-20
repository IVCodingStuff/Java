package Membros;

import java.util.Date;

public class Professor extends Pessoa{
	public Professor(String nome,String cpf,Date DataNascimento) {
		super (nome, cpf, DataNascimento);
}
		public double salario;
		public String disciplina;
}