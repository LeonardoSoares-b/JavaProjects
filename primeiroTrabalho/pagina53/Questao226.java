package pagina53;
import java.util.Scanner;
public class Questao226 {


	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o primeiro n�mero: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Digite o segundo n�mero: ");
	        int num2 = scanner.nextInt();
	        scanner.close();
	        int num3= num1*num2;
	        if (num1 % num2 == 0) {
	            System.out.println(num1 + " � m�ltiplo de " + num2);
	            System.out.println(num3+"� o resultado!");
	        } else {
	            System.out.println(num1 + " n�o � m�ltiplo de " + num2);
	        }
	    }
	}
		
}
