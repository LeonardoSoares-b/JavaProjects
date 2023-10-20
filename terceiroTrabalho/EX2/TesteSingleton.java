public class TesteSingleton {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println("instância 1 é a mesma que instância 2: " + (instance1 == instance2));

        instance1.TesteMetodoSingleton();
    }
}
