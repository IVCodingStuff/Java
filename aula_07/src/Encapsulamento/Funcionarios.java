package Encapsulamento;

public class Funcionarios {
	public String nome;
	String endereco;
	private String cpf;
	private String rg;
	private String telefone;
	private String email;
	private double salario;
	private int q_filhos;
	public Funcionarios() {
		
	}
		
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getQ_filhos() {
		return q_filhos;
	}
	public void setQ_filhos(int q_filhos) {
		this.q_filhos = q_filhos;
	}
}
