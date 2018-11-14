package farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    ArrayList<Animal> animalList;

    public Farm() {
        this.animalList = new ArrayList<>();
    }

    int slots = 6;

    public void breed() {
        for (int i = 0; i < animalList.size(); i++) {
            if (animalList.size() <= slots) {
                animalList.add(new Animal("cow2",50, 50));
            }
        }
    }

    public void slaughter() {
        Animal toBeKilled = animalList.get(0);
        for (int i = 0; i < animalList.size(); i++) {
            for (int j = 0; j < animalList.size(); j++) {
                if (animalList.get(i).hunger < animalList.get(j).hunger) {
                    toBeKilled = animalList.get(i);
                }
            }

        }
        animalList.remove(toBeKilled);
    }

}
