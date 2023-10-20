public class LanchoneteRT extends FabricaSanduicheFactory{

    @Override
    public Sanduiche FactorySanduiche() {
        return new Sanduiche("Bola", "Cheddar", "De Peru", "Sem Verdura", "Lanchonete RT");
    }
}