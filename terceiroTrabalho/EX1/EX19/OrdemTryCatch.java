package EX19;

public class OrdemTryCatch {
    public static void main(String[] args) {
        
        try {
            int[] array = new int[5];
            array[10] = 42;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Capturou ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Capturou Exception: " + e.getMessage());
        }
    }
}