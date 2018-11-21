package MatRev;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Cleanable> thingsToClean = new ArrayList<>();  //list is an interface here
        Bed bed = new Bed();
        thingsToClean.add(bed);
        Cleanable bed2 = new Bed();
        ((Bed) bed2).sleepIn(); //fuck intelliJ - by Levi
     //   bed2.sleepIn();  //it's not a bed but a cleanable object
        Bed thisIsABed = (Bed) bed2;
        System.out.println(thisIsABed.equals(bed2));

     //   thingsToClean.get(0).
        thingsToClean.add(new Spoon());

        thingsToClean.add(bed);
        thingsToClean.add(new Spoon());

        thingsToClean.add(new SpecialFork());


    }
}
