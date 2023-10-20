package EX3;

public class TesteIncremental {
    public static void main(String[] args) {
        Incremental inc = Incremental.getInstrance();
        for (int i = 0 ; i < 10; i++) {
            inc.setNumber();
            System.out.println(inc);
        }
    }
}
