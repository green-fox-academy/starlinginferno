import java.util.*;

public class Matchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }
    public static ArrayList<String> makingMatches (ArrayList<String> g, ArrayList<String> b){
        ArrayList<String> pairs = new ArrayList<>();
        for (int i = 0; i < g.size(); i++) {
            pairs.add(g.get(i));
            pairs.add(b.get(i));
            //        if (b.size() > g.size()) {
            pairs.add(pairs.size(), b.get(b.size()-1));
            // myArrayList.get(myArrayList.size()-1)
            //       }
        }
        return pairs;
    }
}