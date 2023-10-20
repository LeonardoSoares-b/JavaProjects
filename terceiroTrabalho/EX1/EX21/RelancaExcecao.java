package EX21;

public class RelancaExcecao {
    static void someMethod2() throws Exception {
        throw new Exception("Exceção lançada em someMethod2");
    }

    static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception e) {
            System.out.println("Capturou exceção em someMethod");
            throw e; // Relança a exceção capturada
        }
    }
    
}
