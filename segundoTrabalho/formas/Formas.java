package formas;

public class Formas {
	 abstract double obterArea();
	}

	class FormaBidimensional extends Forma {
	    @Override
	    double obterArea() {
	        return 0.0; // Implemente o cálculo da área para a forma bidimensional específica
	    }
	}

	class FormaTridimensional extends Forma {
	    double obterVolume() {
	        return 0.0; // Implemente o cálculo do volume para a forma tridimensional específica
	    }

	    @Override
	    double obterArea() {
	        return 0.0; // Implemente o cálculo da área para a forma tridimensional específica
	    }
	}

	class Quadrado extends FormaBidimensional {
	    private double lado;

	    public Quadrado(double lado) {
	        this.lado = lado;
	    }

	    @Override
	    double obterArea() {
	        return lado * lado;
	    }
	}

	class Circulo extends FormaBidimensional {
	    private double raio;

	    public Circulo(double raio) {
	        this.raio = raio;
	    }

	    @Override
	    double obterArea() {
	        return Math.PI * raio * raio;
	    }
	}

	class Cubo extends FormaTridimensional {
	    private double lado;

	    public Cubo(double lado) {
	        this.lado = lado;
	    }

	    @Override
	    double obterArea() {
	        return 6 * lado * lado;
	    }

	    @Override
	    double obterVolume() {
	        return lado * lado * lado;
	    }
	}

	class Esfera extends FormaTridimensional {
	    private double raio;

	    public Esfera(double raio) {
	        this.raio = raio;
	    }

	    @Override
	    double obterArea() {
	        return 4 * Math.PI * raio * raio;
	    }

	    @Override
	    double obterVolume() {
	        return (4.0 / 3.0) * Math.PI * raio * raio * raio;
	    }
	}

	public class HierarquiaFormas {
	    public static void main(String[] args) {
	        Forma[] formas = new Forma[4];
	        formas[0] = new Quadrado(5);
	        formas[1] = new Circulo(3);
	        formas[2] = new Cubo(4);
	        formas[3] = new Esfera(2);

	        for (Forma forma : formas) {
	            if (forma instanceof FormaBidimensional) {
	                System.out.println("Forma bidimensional:");
	                System.out.println("Área: " + forma.obterArea());
	            } else if (forma instanceof FormaTridimensional) {
	                FormaTridimensional formaTridimensional = (FormaTridimensional) forma;
	                System.out.println("Forma tridimensional:");
	                System.out.println("Área: " + formaTridimensional.obterArea());
	                System.out.println("Volume: " + formaTridimensional.obterVolume());
	            }

	            System.out.println();
	        }
	    }
	}

}
