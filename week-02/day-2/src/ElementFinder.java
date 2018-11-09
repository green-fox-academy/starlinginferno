import java.util.*;

public class ElementFinder{
    public static void main(String... args){
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(containsSeven(arrayList));
        // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
        // The output should be: "Noooooo"
        // Do this again with a different solution using different list methods!

    }

    public static String containsSeven (ArrayList<Integer> x) {
        String reply = "";
        for (int i = 0; i < x.size(); i++) {
            if (x.contains(7)) {
                reply = "Hoorray";
            } else { reply = "Noooooo";}
        }
        return reply;
    }

}