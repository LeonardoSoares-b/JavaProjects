package EX22;

public class TestaExcecao {
    public static void main(String[] args) {
        try {
            ExcecaoEscopo.methodWithTryCatch();
        } catch (ArithmeticException e) {
            System.out.println("Capturou ArithmeticException no main:");
            e.printStackTrace();
        }
    }
}
