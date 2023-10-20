package EX20;

public class TestaSomeClass {
    public static void main(String[] args) {
        try {
            SomeClass someObject = new SomeClass();
        } catch (Exception e) {
            System.out.println("Capturou a exceção: " + e.getMessage());
        }
    }
}
