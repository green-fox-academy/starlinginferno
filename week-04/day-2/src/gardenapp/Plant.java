package gardenapp;

public class Plant {
    String color = "";
    double waterLvl;
    boolean thirsty;
    double absorb;

    public Plant (String color, double waterLvl, boolean thirsty, double absorb) {
        this.color = color;
        this.waterLvl = waterLvl;
        this.thirsty = thirsty;
        this.absorb = absorb;
    }

    /*public void needsWater() {
        if (this.thirsty) {
            System.out.println("The " + this.color + this.getClass().getSimpleName() + " needs water.");
        } else {
            System.out.println("The " + this.color + this.getClass().getSimpleName() + " flower doesn't need water.");
        }
    }*/

}
