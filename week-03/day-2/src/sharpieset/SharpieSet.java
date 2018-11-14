package sharpieset;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

    ArrayList<Sharpie> sharpie;

    public SharpieSet() {
        this.sharpie = new ArrayList<>();
    }



    public void countUsable() {
        for (int i = 0; i < sharpie.size(); i++) {
            if (sharpie.get(i).inkAmount > 0) {
                sharpie.get(i);
            }
        }
    }

    public void removeTrash() {
        for (int i = 0; i < sharpie.size(); i++) {
            if (sharpie.get(i).inkAmount <= 0) {
                sharpie.remove(i);
            }
        }
    }

}
