package main.java.music;

public class BassGuitar extends StringedInstrument {
    public BassGuitar() {
        this(4);
    }

    public BassGuitar(int numberOfStrings) {
        super(numberOfStrings, "Bass Guitar");

    }

    @Override
    String sound() {
        return "Duum-duum-duum";
    }
}
