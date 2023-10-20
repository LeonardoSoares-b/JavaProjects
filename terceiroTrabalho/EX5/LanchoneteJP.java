public class LanchoneteJP extends FabricaSanduicheFactory{


    @Override
    public Sanduiche FactorySanduiche() {
        return new Sanduiche("Frances", "Mussarela", "De Frango", "Com Verdura", "Lanchonete JP");
    }
}