package EX8;

public class Main {

    public static void main(String[] args) {
        SomadorExistente somadorExistente = new SomadorExistente();
        SomadorAdapter adapter = new SomadorAdapter(somadorExistente);
        Cliente cliente = new Cliente(adapter);
        cliente.executar();
    }
    
}
