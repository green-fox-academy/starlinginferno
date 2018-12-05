package gardenapp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Garden garden = new Garden();

        Flower yellowFlower = new Flower("yellow", 0, true, 0.75);
        garden.plantGarden.add(yellowFlower);
        Flower blueFlower = new Flower("blue", 0, true, 0.75);
        garden.plantGarden.add(blueFlower);
        Tree purpleTree = new Tree("purple", 0, true, 0.4);
        garden.plantGarden.add(purpleTree);
        Tree orangeTree = new Tree("orange", 0, true, 0.4);
        garden.plantGarden.add(orangeTree);

        yellowFlower.needsWater(); //might make a field variable later or GET CLASS METHOD?         System.out.println(yellowFlower.getClass().getSimpleName());
        blueFlower.needsWater();
        purpleTree.needsWater();
        orangeTree.needsWater();

        garden.waterPlants(40);

        yellowFlower.needsWater();
        blueFlower.needsWater();
        purpleTree.needsWater();
        orangeTree.needsWater();

        garden.waterPlants(70);

        yellowFlower.needsWater();
        blueFlower.needsWater();
        purpleTree.needsWater();
        orangeTree.needsWater();


    }
}
