package EX22;

public class ExcecaoEscopo {
    static void methodWithTryCatch() {
        try {
            int result = 10 / 0; // Isso causará uma ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Capturou ArrayIndexOutOfBoundsException no método");
        }
    }
}
