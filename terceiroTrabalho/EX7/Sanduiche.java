public class Sanduiche
{
    private iFactoryLanche sanduiche;

    public Sanduiche(String lanchonete, String string, String string2, String string3, String string4){
        this.sanduiche = LancheFactory.CriaLanche(lanchonete);
    }

    public iFactoryLanche getSanduiche(){
        return this.sanduiche;
    }
}
