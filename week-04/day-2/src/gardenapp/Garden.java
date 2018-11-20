package gardenapp;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    List<Plant> plantGarden = new ArrayList<>();

/*    public void addFlower(Flower flower) {
        plantGarden.add(flower);
    }

    public void addTree(Tree tree) {
        plantGarden.add(tree);
    }*/

    public void waterPlants(int water) {
        int counter = 0;
        for (int i = 0; i < plantGarden.size(); i++) {
            if (plantGarden.get(i).thirsty) {
                counter += 1;
            }
        }

        for (int j = 0; j < plantGarden.size(); j++) {
            if (plantGarden.get(j).thirsty) {
                plantGarden.get(j).waterLvl += water / counter * plantGarden.get(j).absorb;
            }
        }
    }
}
