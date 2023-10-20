package pagina53;
import java.util.Scanner;

public class Questao225 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um numero para saber se e par ou impar: ");
		int numero = scanner.nextInt();
		scanner.close();

		if(numero%2==0) {
			System.out.println("o numero é par");
		}
		else {
			System.out.println("o numero é impar");
		}
		
	}
	
}
