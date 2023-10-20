public class Sanduiche {

    private String pao;
    private String queijo;
    private String presunto;
    private String salada;
    private String nomeLanchonete;

    public Sanduiche(String pao, String queijo, String presunto, String salada, String nomeLanchonete) {

        this.pao = pao;
        this.queijo = queijo;
        this.presunto = presunto;
        this.salada = salada;
        this.nomeLanchonete = nomeLanchonete;
    }

    @Override
    public String toString() {
        return "\nSanduiche: " + "" +
                "\nLanchonete: " + nomeLanchonete +
                "\nPão: " + pao +
                "\nQueijo: " + queijo +
                "\nPresunto" + presunto +
                "\nSalada: " + salada;
    }

}