package fleetofthings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Thing t1 = new Thing("one");
        Thing t2 = new Thing("two");
        List<Thing> things = new ArrayList<>();
        things.add(t1);
        things.add(t2);
        System.out.println(things);
        Collections.sort(things);

        System.out.println(t1.compareTo(t2));
    }
}
