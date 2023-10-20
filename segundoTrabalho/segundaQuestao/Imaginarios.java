package segundaQuestao;
import java.lang.Math;

public class Imaginarios {
	private double ParteImaginaria;
	
	private double ParteReal;
	
	public Imaginarios(double ParteImaginaria,double ParteReal ) {
		this.ParteImaginaria=ParteImaginaria;
		this.ParteReal=ParteReal;
	}
	public Imaginarios() {
		ParteImaginaria = 0.0;
		ParteReal = 0.0;
	}
	public Imaginarios adicao(Imaginarios other) {
        double somaReal = this.ParteReal + other.ParteReal;
        double somaImaginario = this.ParteImaginaria*Math.sqrt(-1) + other.ParteImaginaria*Math.sqrt(-1);
        return new Imaginarios(somaReal, somaImaginario);
    }

	public Imaginarios subtracao(Imaginarios other) {
        double subtraiReal = this.ParteImaginaria*Math.sqrt(-1) - other.ParteImaginaria*Math.sqrt(-1);
        double subtraiImaginario = this.ParteReal - other.ParteReal;
        return new Imaginarios(subtraiReal, subtraiImaginario);
    }
	@Override 
	public String toString() {
		return "("+this.ParteReal+","+this.ParteImaginaria+")";
	}
}
