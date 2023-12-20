package Encapsulamento;

public class RH {
	public static void main(String[] args) {
	Funcionarios f1 = new Funcionarios();
		f1.nome = "Frederico Jorge";
		f1.endereco = "Rua dos Anjos, 666";
		f1.setCpf ("12344415722");
		String cpf = f1.getCpf(); 
		f1.setRg ("3356675");
		String rg = f1.getRg(); 
		f1.setTelefone ("81966778425");
		String telefone = f1.getTelefone(); 
		f1.setEmail ("FredJorge@gmail.com");
		String email = f1.getEmail(); 
		f1.setSalario (3500.0);
		double salario = f1.getSalario(); 
		f1.setQ_filhos (1);
		int q_filhos = f1.getQ_filhos(); 
	}
}
