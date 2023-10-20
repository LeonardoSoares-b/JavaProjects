package fabrica;

public class Carro {
	String marca;
    String modelo;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String mostrar() {
        return marca + " " + modelo;
    }

}
