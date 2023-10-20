package questao03;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite tres numeros que o programa exibirá a soma, a media, o produto e o maior e o menor numero!");
		System.out.println("Digite o primeiro numero: ");
		int primeiroNumero = scanner.nextInt();
		System.out.println("Digite o segundo numero: ");
		int segundoNumero = scanner.nextInt();
		System.out.println("Digite o terceiro numero: ");
		int terceiroNumero = scanner.nextInt();
		int soma = (primeiroNumero+segundoNumero)+terceiroNumero;
		int media = soma/3;
		int produto = primeiroNumero*segundoNumero*terceiroNumero ;
		
		System.out.println("A soma é: "+ soma);
		System.out.println("A media é: "+ media);
		System.out.println("O produto é: "+produto);

	        int maior = encontrarMaior(primeiroNumero, segundoNumero, terceiroNumero);
	        int menor = encontrarMenor(primeiroNumero, segundoNumero, terceiroNumero);

	        System.out.println("Maior número: " + maior);
	        System.out.println("Menor número: " + menor);
	        scanner.close();
	    }

	    public static int encontrarMaior(int num1, int num2, int num3) {
	        int maior = num1;

	        if (num2 > maior) {
	            maior = num2;
	        }

	        else if (num3 > maior) {
	            maior = num3;
	        }

	        return maior;
	    }

	    public static int encontrarMenor(int num1, int num2, int num3) {
	        int menor = num1;

	        if (num2 < menor) {
	            menor = num2;
	        }

	        else if (num3 < menor) {
	            menor = num3;
	        }

	        return menor;
	    }
		
		
	}


