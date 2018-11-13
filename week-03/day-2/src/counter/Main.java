package counter;

public class Main {
    public static void main(String[] args) {

        Counter num = new Counter();
        for (int i = 0; i < 6; i++) {
            num.add();
        }
        num.add(5);
        num.reset();
        num.get();


    }
}
