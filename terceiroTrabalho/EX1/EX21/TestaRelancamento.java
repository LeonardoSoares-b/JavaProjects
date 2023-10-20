package EX21;

public class TestaRelancamento {
        public static void main(String[] args) {
            try {
                RelancaExcecao.someMethod();
            } catch (Exception e) {
                System.out.println("Capturou exceção em main:");
                e.printStackTrace();
            }
        }
}
