package segundaQuestao;

public class Main {

	public static void main(String[] args) {
		Imaginarios i1 = new Imaginarios(14.8,5.8);
		Imaginarios i2 = new Imaginarios(9.2,2.8);
		
		Imaginarios i3= i1.adicao(i2);
		System.out.println("Soma: "+ i3);
		Imaginarios i4 = i1.subtracao(i2);
		System.out.println("Subtracao: "+ i4);
		

	}

}
