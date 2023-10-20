public class LanchoneteCG extends FabricaSanduicheFactory {


    @Override
    public Sanduiche FactorySanduiche() {
        return new Sanduiche("Integral", "Prato", "De Frango", "Sem Verdura", "Lanchonete CG");
    }

}