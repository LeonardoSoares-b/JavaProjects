package EX4;

public class Main {

    public static void main(String[] args) {

        Forma circulo = new Forma("Circulo");

        FormaGeometrica meuCirculo = circulo.getNome();
        meuCirculo.desenhar();

        Forma quadrado = new Forma("Quadrado");

        FormaGeometrica meuQuadrado = quadrado.getNome();
        meuQuadrado.desenhar();

        Forma triangulo = new Forma("Triangulo");

        FormaGeometrica meuTriangulo = triangulo.getNome();
        meuTriangulo.desenhar();

    }
}