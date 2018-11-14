package farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    List<Animal> farmAnimals;
    int slots = 6;

    public static List<Animal> animalFarm () {

        List<Animal> animals = new ArrayList<>(); {
            animals.add(new Animal (20, 60));
            animals.add(new Animal (60, 10));
            animals.add(new Animal (55, 72));
            animals.add(new Animal (53, 27));
            animals.add(new Animal (28, 91));

            return animals; }
    }

    public void breed() {
        for (int i = 0; i < farmAnimals.size(); i++) {
            if (farmAnimals.size() <= slots) {
                farmAnimals.add(new Animal(50, 50));
            }
        }
    }

    public void slaughter() {
        for (int i = 0; i < farmAnimals.size(); i++) {
            for (int j = 0; j < farmAnimals.size(); j++) {
                if (farmAnimals.get(i).hunger < farmAnimals.get(j).hunger) {
                    farmAnimals.remove(i);
                }
            }
        }
    }

}
