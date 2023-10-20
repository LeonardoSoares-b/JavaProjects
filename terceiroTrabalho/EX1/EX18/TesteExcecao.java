package EX18;

import java.io.IOException;

public class TesteExcecao {
    public static void main(String[] args) {
        try {
            throw new ExceptionA("Exceção da classe ExceptionA");
        } catch (Exception exception) {
            System.out.println("Capturou Exception: " + exception.getMessage());
        }

        try {
            throw new ExceptionB("Exceção da classe ExceptionB");
        } catch (Exception exception) {
            System.out.println("Capturou Exception: " + exception.getMessage());
        }

        try {
            throw new NullPointerException("Exceção NullPointerException");
        } catch (Exception exception) {
            System.out.println("Capturou Exception: " + exception.getMessage());
        }

        try {
            throw new IOException("Exceção IOException");
        } catch (Exception exception) {
            System.out.println("Capturou Exception: " + exception.getMessage());
        }
    }
}