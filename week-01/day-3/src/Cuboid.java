public class Cuboid {
    public static void main(String[] args) {
        double a = 5;
        double b = 5.5;
        double c = 6.5;

        double surface = (4 * (b * c)) + (2 * (b * a));
        double volume = a * b * c;

        System.out.println("Surface Area: " + surface);
        System.out.println("Volume: " + volume);

    }
}
