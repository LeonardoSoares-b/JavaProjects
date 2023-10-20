package questao02;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	System.out.println("Este programa é um comparador dr inteiros!");
	System.out.println("Digite o primeiro numero a ser comparado: ");
	System.out.println("Digite o primeiro numero: ");
	int primeiroNumero = scanner.nextInt();
	System.out.println("Digite o segundo numero: ");
	int segundoNumero = scanner.nextInt();
	if(primeiroNumero>segundoNumero) {
		System.out.println("O "+ primeiroNumero+" é maior que "+ segundoNumero);
	}
	else if(segundoNumero>primeiroNumero) {
		System.out.println("O "+ segundoNumero+" é maior que "+ primeiroNumero);

	}
	else {
		System.out.println("Os dois são iguais!");
	}
	scanner.close();
}
}