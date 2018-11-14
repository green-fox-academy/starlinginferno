package farm;

public class Animal {
    int hunger;
    int thirst;

    public Animal(int hunger, int thirst) {
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
