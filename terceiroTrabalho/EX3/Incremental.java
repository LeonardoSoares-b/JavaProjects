package EX3;

public class Incremental {

    private static Incremental instance = null;
    private static int count = 0;
    private int number;

    private Incremental () {

    }

    public static Incremental getInstrance() {
        if (instance == null) {
            instance = new Incremental();
        }
        return instance;
    }

    public void setNumber() {
        this.number = count++;
    }

    @Override
    public String toString() {
        return "Incremental " + number;
    }
}
