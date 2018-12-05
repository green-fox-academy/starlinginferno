package MatRev.garden;

public class Plant implements Waterable {
    private int currentWaterLevel;
    private double absorbLevel;
    private int minWaterLevel;

    public Plant(Double absorbLevel, int minWaterLevel) {
        currentWaterLevel = 0;
        this.absorbLevel = absorbLevel;
        this.minWaterLevel = minWaterLevel;
    }

    @Override
    public void water(int amount) {
        currentWaterLevel += amount * absorbLevel;
    }

    @Override
    public String toString() {
        return "The plant " + (needWater() ? "needs" : " doesn't need ") + " water";
    }

    @Override
    public boolean needWater() {
        return currentWaterLevel < minWaterLevel;

    }
}
