public class TestaExcecao {
    public static void main(String[] args) {
        try {
            throw new ExceptionC("Essa é a exceção da ExceptionA");
        } catch (ExceptionA e) {
            System.out.println("Capturou ExceptionA: " + e.getMessage());
        }
        
        try {
            throw new ExceptionB("Esta é a exceção da ExceptionB");
        } catch (ExceptionA e) {
            System.out.println("Capturou Exception1: " + e.getMessage());
        }
    }
}
