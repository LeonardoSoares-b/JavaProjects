package EX4;

public class FormaGeometricaFactory {


    public static FormaGeometrica getForma(String nome) {
        if (nome == null) {
            return null;
        } else if (nome.equals("Circulo")){
            return new Circulo();
        } else if (nome.equalsIgnoreCase("Quadrado")){
            return new Quadrado();
        } else if (nome.equalsIgnoreCase("Triangulo")) {
            return new Triangulo();
        }

        return null;
    }

}