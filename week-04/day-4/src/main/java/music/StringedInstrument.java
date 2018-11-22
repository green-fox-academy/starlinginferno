package main.java.music;

public abstract class StringedInstrument extends Instruments {
    private int numberOfStrings;

    public StringedInstrument(int numberOfStrings, String name) {
        this.numberOfStrings = numberOfStrings;
        this.name = name;
    }

    public StringedInstrument(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    abstract String sound();

    public void play() {
        System.out.println(name + ", a " + numberOfStrings +"-stringed instrument that goes " + sound());
     //   String.format("%s , a %d-stringed instument that goes %s", name, numberOfStrings, sound());
     //   System.out.printf("%s , a %d-stringed instument that goes %s\n", name, numberOfStrings, sound());
    }

}
