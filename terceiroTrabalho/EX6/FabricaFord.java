package fabrica;

public class FabricaFord implements FabricaCarros {
    public Sedan criarSedan() {
        return new FiestaSedan("Ford", "Fiesta Sedan");
    }

    public Popular criarPopular() {
        return new Fiesta("Ford", "Fiesta");
    }

}
