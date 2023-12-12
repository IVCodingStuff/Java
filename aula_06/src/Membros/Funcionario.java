package Membros;

import java.util.Date;

public class Funcionario extends Pessoa{
	public Funcionario(String nome,String cpf,Date DataNascimento) {
		super (nome, cpf, DataNascimento);
}
		public double salario;
		public Date data_admissao;
		public String cargo;
}
