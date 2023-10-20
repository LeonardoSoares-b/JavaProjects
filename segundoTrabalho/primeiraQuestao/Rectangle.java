package primeiraQuestao;

public class Rectangle {
	private double length;
	private double width;
	
	
	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
		if(length<0.0) {
			System.out.println("Numero menor que zero!");
		}
		else if(length>20.0) {
			System.out.println("Numero maior que vinte!");
		}
		
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
		if(width<0.0) {
			System.out.println("Numero menor que zero!");
		}
		else if(width>20.0) {
			System.out.println("Numero maior que vinte!");
		}
	}


	public Rectangle(double length, double width) {
		this.length=length;
		this.width=width;
	}
	
	public double area() {
		return this.length*this.width;	
	}
	public double perimetro() {
		return (this.length*2)+(this.width*2);
	}

}
