package sharpieset;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        SharpieSet sharpies = new SharpieSet();
        sharpies.sharpie = new ArrayList<>();


        sharpies.sharpie.add(new Sharpie ("red", 2.5f, 100f));
        sharpies.sharpie.add(new Sharpie ("orange", 3f, 50f));
        sharpies.sharpie.add(new Sharpie ("yellow", 2.1f, 30f));
        sharpies.sharpie.add(new Sharpie ("green", 3.2f, 80f));
        sharpies.sharpie.add(new Sharpie ("blue", 2.8f, 75f));
        sharpies.sharpie.add(new Sharpie ("violet", 2.6f, 62f));



        for (int i = 0; i < sharpies.sharpie.size(); i++) {
            for (int j = 0; j <= 30; j++) {
                sharpies.sharpie.get(i).use();
            }
            System.out.println(sharpies.sharpie.get(i).color + sharpies.sharpie.get(i).inkAmount);
            sharpies.countUsable();
            sharpies.removeTrash();
            System.out.println(sharpies.sharpie.get(i).color);
        }

    }
}
