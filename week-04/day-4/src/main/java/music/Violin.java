package main.java.music;

public class Violin extends StringedInstrument {
    public Violin() {
        super(4, "Violin");
    }

    @Override
    String sound() {
        return "Screech";
    }
}
