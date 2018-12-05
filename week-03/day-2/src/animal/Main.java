package animal;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal();
        for (int i = 0; i < 5; i++) {
            lion.eat();
        }
        System.out.println(lion.hunger);
    }
}
