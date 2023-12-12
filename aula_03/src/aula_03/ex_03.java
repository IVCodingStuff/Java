package aula_03;

import java.util.StringTokenizer;

public class ex_03 {

	public static void main(String[] args) {
		String str = "Hello world";
		String resultado = str.replace('l','w'); //troca um por outro
		System.out.println(resultado);
		String resultado2 = str.substring(3, 8); //separa uma parte da string
		System.out.println(resultado2);
		String resultado3 = str.toLowerCase(); // tudo em minusculo
		System.out.println(resultado3);
		char resultado4 = str.charAt(1); //Localização especifíca
		System.out.println(resultado4);
		String s1 = "Hello";
		String s2 = "HELLO";
		boolean b1 = s1.equals("Hello"); // verifica se tem
		boolean b2 = s1.equals(s2);
		boolean b3 = s1.equalsIgnoreCase(s2); // verifica se tem ignorando as maiusculas
		boolean b4 = s1.equalsIgnoreCase("azul");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		int pos = str.indexOf("l");// onde certo valor aparece pela primeira vez
		System.out.println(pos);
		
		String valor = "CDD4.0 - Java";
		System.out.println(valor.compareTo("CDD4.0 - Java") == 0 ? true : false);// compara e retorna boolean

		System.out.println(valor.compareTo("CDD4.0 - JAVA") == 0 ? true : false);// compara e retorna boolean

		System.out.println(valor.compareToIgnoreCase("CDD4.0 - Java") == 0 ? true : false);// compara sem levar em conta as maiusculas e retorna boolean
		System.out.println(" ");
		
		String valor2 = "CDD - Java";
		System.out.println (valor2.endsWith("Java")); // verifica se começa com tal coisa
		System.out.println (valor2.startsWith("C")); // verifica se termina com tal coisa
		System.out.println (valor2.startsWith("DD"));
		
		StringTokenizer exemplo = new StringTokenizer("O mundo não é mais o mesmo mas não iremos desistir nunca");
		System.out.println(exemplo.countTokens());// conta quantas palavras tem separados por espaço
		}
}
