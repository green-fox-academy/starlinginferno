package main.java.music;

public abstract class StringedInstrument extends Instruments {
    int numberOfStrings;
    String sound = "";

    public StringedInstrument(int numberOfStrings, String sound) {
        this.numberOfStrings = numberOfStrings;
        this.sound = sound;

    }

    public StringedInstrument(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
        sound(sound);

    }

    String sound(String sound) {
        return sound;
    }

    public void play() {
        System.out.println(name + ", a " + numberOfStrings +"-stringed instrument that goes " + sound);
    }

}
