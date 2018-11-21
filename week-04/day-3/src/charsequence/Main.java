package charsequence;

public class Main {
    public static void main(String[] args) {
        Gnirts gnirt = new Gnirts();
        System.out.println(gnirt.charAt(2));
     //   System.out.println(g.charAt(2));

        Shifter shifter = new Shifter("this example", 2);
        System.out.println(shifter.charAt(0));
    }
}
