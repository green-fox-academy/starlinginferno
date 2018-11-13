package sharpie;

public class Main {
    public static void main(String[] args) {
        Sharpie s1 = new Sharpie("hot pink", 10.5f);
        for (int i = 0; i <= 19; i++) {
            s1.use();
        }
        System.out.println(s1.inkAmount);
    }
}
