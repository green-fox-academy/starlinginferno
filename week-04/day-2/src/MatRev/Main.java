package MatRev;

public class Main {
    public static void main(String[] args) {
        Cat tom = new Cat();
        dailyRoutine(tom);
        tom.purr();

        Dog snoopy = new Dog();
        dailyRoutine(snoopy);
        snoopy.bark();

    }

    static public void dailyRoutine(Animal animal) {
        System.out.println(animal.isHungry());
        animal.eat(10);
        System.out.println(animal.isHungry());
        animal.walk();
        System.out.println(animal.isHungry());
        System.out.println(animal.poop());
    }

}
