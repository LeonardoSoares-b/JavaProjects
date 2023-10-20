import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int escolha;

        System.out.print("Insira uma opção de lanchonete:\n 1 - Lanchonete CG;\n" +
                " 2 - Lanchonete JP;\n 3 - Lanchonete RT:\n   --> " );
        escolha = ler.nextInt();

        if (escolha == 1) {
            FabricaSanduicheFactory sanduiche = new LanchoneteCG();
            Sanduiche meuSanduiche = sanduiche.FactorySanduiche();
            System.out.println(meuSanduiche);
        } else if (escolha == 2) {
            FabricaSanduicheFactory sanduiche = new LanchoneteJP();
            Sanduiche meuSanduiche = sanduiche.FactorySanduiche();
            System.out.println(meuSanduiche);
        } else if (escolha == 3) {
            FabricaSanduicheFactory sanduiche = new LanchoneteRT();
            Sanduiche meuSanduiche = sanduiche.FactorySanduiche();
            System.out.println(meuSanduiche);
        } else {
            System.out.println("\nEscolha Invalida!");
        }


    }
}