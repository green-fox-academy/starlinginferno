package farm;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Farm animals = new Farm();
        animals.animalList = new ArrayList<>();

        animals.animalList.add(new Animal ("cow",60, 10));
        animals.animalList.add(new Animal ("pig",55, 72));
        animals.animalList.add(new Animal ("sheep",53, 27));
        animals.animalList.add(new Animal ("horse" ,28, 91));
        animals.animalList.add(new Animal ("chicken", 20, 60));

        animals.slaughter();

        for (int i = 0; i < animals.animalList.size(); i++) {
            animals.breed();
            System.out.println(animals.animalList.get(i).name);
        }

    }
}
