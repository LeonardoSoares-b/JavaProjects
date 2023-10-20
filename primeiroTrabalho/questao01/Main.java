package primeiroTrabalho;
import java.util.Scanner;



public class Questao01 {

		public static void main(String []args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Digite o primeiro numero: ");
			int primeiroNumero = scanner.nextInt();
			System.out.println("Digite o segundo numero: ");
			int segundoNumero = scanner.nextInt();
			System.out.println("O programa ira fazer as quatro operacoes simples com os numeros agora:");
			int soma = primeiroNumero + segundoNumero;
			int subtracao = primeiroNumero - segundoNumero;
			double divisao = primeiroNumero / segundoNumero;
			int multiplicacao = primeiroNumero * segundoNumero;
			System.out.println("A soma e: " +soma);
			System.out.println("A subtracao e: " +subtracao);
			System.out.println("A divisao e: " +divisao);
			System.out.println("A multiplicacao e: " +multiplicacao);
			scanner.close();
			
		}
}
