package EX4;

public class Forma {

    private FormaGeometrica nome;

    public Forma(String nome) {
        this.nome = FormaGeometricaFactory.getForma(nome);
    }

    public FormaGeometrica getNome() {
        return nome;
    }
}