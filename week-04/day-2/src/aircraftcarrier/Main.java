package aircraftcarrier;

public class Main {
    public static void main(String[] args) throws Exception {

        Aircraft f16 = new F16();
        System.out.println(f16.getStatus());
        f16.refill(800);
        System.out.println(f16.getStatus());
        f16.refill(800);
        System.out.println(f16.getStatus());
        System.out.println(f16.isPriority());

        Aircraft f35 = new F35();
        System.out.println(f35.getStatus());
        f35.refill(800);
        System.out.println(f35.getStatus());
        System.out.println(f35.isPriority());

        Carrier carrier = new Carrier(0, 200, 0);
        System.out.println(carrier);

        System.out.println("Fight.");
        f16.fight();
        f35.fight();
        System.out.println(carrier);

        System.out.println("Fill.");
        f16.refill(2);
        f35.refill(7);
        System.out.println(carrier);

        System.out.println("Fill carrier");
        carrier.fill();
        System.out.println(carrier);

        System.out.println(carrier);

        Aircraft enemy1 = new F16();
        Aircraft enemy2 = new F35();
        Carrier carrier2 = new Carrier(100, 100, 0);
        System.out.println(carrier2);

        carrier.fight(carrier2);
    }
}
