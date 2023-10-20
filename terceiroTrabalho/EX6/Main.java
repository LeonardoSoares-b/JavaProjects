package fabrica;

public class Main {
    public static void main(String[] args) {
        FabricaCarros fabricaFiat = new FabricaFiat();
        FabricaCarros fabricaFord = new FabricaFord();
        
        Sedan carroSedan = fabricaFiat.criarSedan();
        System.out.println("Carro Sedan: " + carroSedan.mostrar());
        
        Popular carroPopular = fabricaFord.criarPopular();
        System.out.println("Carro Popular: " + carroPopular.mostrar());
    }

}
