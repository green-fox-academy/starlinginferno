package MatRev.garden;

import java.util.ArrayList;
import java.util.List;

public class Garden implements Waterable {
    private List<Waterable> plants;

    @Override
    public void water(int amount) {
        List<Waterable> thirstyPlants = getThirstyPlants();
        amount /= thirstyPlants.size();

        for (Waterable plant : thirstyPlants) {
                plant.water(amount);
        }
    }

    @Override
    public boolean needWater() {
        return !getThirstyPlants().isEmpty();
    }

    public void add(Waterable plant) throws NullPlantException {
        if (plant == null) {
            throw new NullPlantException ("Do not put null plants in my garden.");
        }
        plants.add(plant);
    }

    public List<Waterable> getThirstyPlants() {
        List<Waterable> thirstyPlants = new ArrayList<>();
        int count = 0;
        for (Waterable plant : plants) {
            if (plant.needWater()) {
                count++;
            }
        }
        return thirstyPlants;
    }

    @Override
    public String toString() {
        String result = "";
        for (Waterable plant : plants) {
            result += plant.toString() + "\n";
        }
        return result;
    }
}
