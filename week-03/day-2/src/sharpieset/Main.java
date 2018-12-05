package sharpieset;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        SharpieSet sharpies = new SharpieSet();
        sharpies.sharpieList = new ArrayList<>();


        sharpies.sharpieList.add(new Sharpie ("red", 2.5f, 100f));
        sharpies.sharpieList.add(new Sharpie ("orange", 3f, 50f));
        sharpies.sharpieList.add(new Sharpie ("yellow", 2.1f, 30f));
        sharpies.sharpieList.add(new Sharpie ("green", 3.2f, 80f));
        sharpies.sharpieList.add(new Sharpie ("blue", 2.8f, 75f));
        sharpies.sharpieList.add(new Sharpie ("violet", 2.6f, 62f));



        for (int i = 0; i < sharpies.sharpieList.size(); i++) {
            for (int j = 0; j <= 30; j++) {
                sharpies.sharpieList.get(i).use();  //uses sharpies for 30 ink
            }
            System.out.println(sharpies.sharpieList.get(i).color + sharpies.sharpieList.get(i).inkAmount);  //how much ink remains in the sharpies
            sharpies.countUsable();  //counts the sharpies that still have ink left
            sharpies.removeTrash();  //removes the empty sharpies
            System.out.println(sharpies.sharpieList.get(i).color);  //prints the remaining sharpies
        }

    }
}
