package sharpieset;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

    ArrayList<Sharpie> sharpieList;

    public SharpieSet() {
        this.sharpieList = new ArrayList<>();
    }



    public void countUsable() {
        for (int i = 0; i < sharpieList.size(); i++) {
            if (sharpieList.get(i).inkAmount > 0) {
                sharpieList.get(i);
            }
        }
    }

    public void removeTrash() {
        for (int i = 0; i < sharpieList.size(); i++) {
            if (sharpieList.get(i).inkAmount <= 0) {
                sharpieList.remove(i);
            }
        }
    }

}
