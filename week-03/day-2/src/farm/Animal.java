package farm;

public class Animal {

    String name = "";
    int hunger;
    int thirst;

    public Animal(String name, int hunger, int thirst) {
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
    }

    public void eat() {
        this.hunger--;
    }
    public void drink() {
        this.thirst--;
    }
    public void play() {
        this.hunger++;
        this.thirst++;
    }
}
