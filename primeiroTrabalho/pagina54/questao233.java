package pagina54;
import java.util.Scanner;
public class questao233 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Calculadora de IMC");
		System.out.println("Insira a altura em metros:");
		float altura = scanner.nextFloat();
		System.out.println("Insira o peso em kilos");
		float pesoEmKg = scanner.nextFloat();
		scanner.close();
		float imc = pesoEmKg/(altura*altura);
		System.out.println("Departament of Health and Human Service/National Institute of Health, portanto o usuario pode avaliar seu IMC: "+imc);
		System.out.println("Abaixo do peso: Abaixo de 18.5 ");
		System.out.println("Normal: Entre 18.5 e 24.9");
		System.out.println("Acima do peso: Entre 25 e 29,9");
		System.out.println("Obeso: Acima de 30");
	}

}
