package fundamentos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class forca {

    public static void main(String[] args) {
        String palavra[] = {"carisma", "inteligencia", "constituicao", "forca", "destreza", "sabedoria"};
        Random random = new Random();
        int numPal = random.nextInt(6);
        boolean fimJogo = true;
        String palavra_secreta = palavra[numPal];
        char[] resposta = new char[palavra_secreta.length()];
        int n_tem = 1;
        int tem = 0;
        ArrayList<Character> letras_digitadas = new ArrayList<>();
        for (int c = 0; c < resposta.length; c++) {
        	resposta [c] = '_';
        }
       

        while (fimJogo) {
            Scanner input = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("Qual letra quer tentar? ");
            char letra = input.next().charAt(0);
            letras_digitadas.add(letra);
            

            for (int c = 0; c < resposta.length; c++) {
                if (letra == palavra_secreta.charAt(c)) {
                    resposta[c] = letra;
                    tem = 1;
                    
                }
            }
            System.out.println();
            for (int c = 0; c < resposta.length; c++) {
            	System.out.print(resposta[c] + " ");
            }
            
            if (tem == 0) {
                n_tem += 1;
            }
            
            System.out.println(" ");
            System.out.println("Letras digitadas: " + letras_digitadas);
            System.out.println(" ");

            tem = 0;

            if (String.valueOf(resposta).equals(palavra_secreta)) {
                System.out.println("VOCÊ VENCEU!");
                fimJogo = false;
                break;
            	} 
            else if (n_tem == 1) {
                System.out.println("____");
            	}
            else if (n_tem == 2) {
                System.out.println("____\n|   |\n| (>o<)\n|\n|\n|");
            	}
            else if (n_tem == 3){
	            System.out.println ("____\n|   |\n| (>o<)\n|   | \n|   \n|");
	        }
	        else if (n_tem == 4){
	            System.out.println ("____\n|   |\n| (>o<)\n|  l|l \n|   \n|");
	        }
	        else if (n_tem == 5){
	            System.out.println ("____\n|   |\n| (>o<)\n|  l|l \n|   \n");
	        }
	        else if (n_tem == 6){
	            System.out.println ("____\n|   |\n| (>o<)\n|  l|l \n|   |\n| _I");
	        }
            if (n_tem == 7) {
                System.out.println("____\n|   |\n| (xox)\n|  l|l \n|   |\n| _I_I_");
                System.out.println("VOCÊ PERDEU!");
                fimJogo = false;
            }
        }
    }
}