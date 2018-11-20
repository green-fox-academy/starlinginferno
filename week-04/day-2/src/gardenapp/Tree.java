package gardenapp;

public class Tree extends Plant {

    public Tree (String color, double waterLvl, boolean thirsty, double absorb) {
        super(color, waterLvl, thirsty, absorb);
    }

    public boolean needsWater() {
        if (this.waterLvl < 10) {
            System.out.println("The " + this.color + " tree needs water.");
            return true;
        } else {
            System.out.println("The " + this.color + " tree doesn't need water.");
            this.thirsty = false;
            return false;
        }
    }
}
