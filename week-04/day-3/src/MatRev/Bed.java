package MatRev;

public class Bed implements Cleanable {
    @Override
    public void clean() {
        System.out.println("Bed got cleaned.");
    }
    public void sleepIn() {
        System.out.println("bed");
    }
}
