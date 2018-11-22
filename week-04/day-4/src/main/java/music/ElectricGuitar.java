package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        this(6);
    }

    public ElectricGuitar(int numberOfStrings) {
        super(numberOfStrings, "Electric Guitar");
    }

    @Override
    String sound() {
        return "Twang";
    }
}
