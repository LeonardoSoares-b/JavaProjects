package pagina53;
import java.util.Scanner;

public class Questao224 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("leio 5 inteiros e entrego o maior e o menor");
		
		System.out.println("primeiro: ");
		int primeiro = scanner.nextInt();
		
		System.out.println("segundo: ");
		int segundo = scanner.nextInt();
		
		System.out.println("terceiro: ");
		int terceiro = scanner.nextInt();
		
		System.out.println("quarto: ");
		int quarto = scanner.nextInt();
		
		System.out.println("quinto: ");
		int quinto = scanner.nextInt();
		int maior = encontrarMaior(primeiro, segundo, terceiro, quarto, quinto);
        int menor = encontrarMenor(primeiro, segundo, terceiro, quarto, quinto);

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        scanner.close();
	} 
         public static int encontrarMaior(int num1, int num2, int num3, int num4,int num5) {
	        int maior = num1;

	        if (num2 > maior) {
	            maior = num2;
	        }
	        else if (num3 > maior) {
	            maior = num3;
	        }
	        else if (num4 > maior) {
	            maior = num4;
	        }
	        else if (num5 > maior) {
	            maior = num5;
	        }

	        return maior;
         }
	
	
	    public static int encontrarMenor(int num1, int num2, int num3, int num4, int num5) {
	        int menor = num1;

	        if (num2 < menor) {
	            menor = num2;
	        }

	        else if (num3 < menor) {
	            menor = num3;
	        }
	        else if (num4 < menor) {
	            menor = num4;
	        }
	        else if (num5 < menor) {
	            menor = num5;
	        }

	        return menor;
	    }

}
