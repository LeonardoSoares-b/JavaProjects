package pagina54;
import java.util.Scanner;
public class questao230 {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite cinco n�meros:");

	        int[] numeros = new int[5];

	        for (int i = 0; i < 5; i++) {
	            numeros[i] = scanner.nextInt();
	        }
	        scanner.close();
	        System.out.println("N�meros digitados:");

	        for (int i = 0; i < 5; i++) {
	            System.out.printf("%d", numeros[i]);

	            if (i < 4) {
	                System.out.print("   ");
	            }
	        }
	    
	}
}

