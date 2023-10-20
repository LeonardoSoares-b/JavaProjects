package fabrica;

public class FabricaFiat implements FabricaCarros {
    public Sedan criarSedan() {
        return new Siena("Fiat", "Siena");
    }

    public Popular criarPopular() {
        return new Palio("Fiat", "Palio");
    }

}
