package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        super(6, "Twang");
    }

    public ElectricGuitar(int numberOfStrings) {
        super(numberOfStrings);
        this.sound = "Twang";


    }
}