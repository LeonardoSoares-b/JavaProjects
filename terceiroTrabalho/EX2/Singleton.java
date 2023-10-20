public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Construtor privado para evitar a criação direta de instâncias
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void TesteMetodoSingleton() {
        System.out.println("Fazendo algo dentro do Singleton.");
    }
}
