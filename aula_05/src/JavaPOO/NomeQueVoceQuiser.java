package JavaPOO;

public class NomeQueVoceQuiser {
		public static void main(String[] args) {
			JavaMetodos cl01 = new JavaMetodos();
			int idade = cl01.idade(); 
			String nome = cl01.nome();
			double valor = cl01.valor();
			boolean estado = cl01.estado();
			System.out.printf("O aluno %s vale $f tem %d anos e tem seu estado %b", nome, valor, idade,estado);
		}
	}
