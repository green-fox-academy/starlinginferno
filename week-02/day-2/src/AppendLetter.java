import java.util.*;

public class AppendLetter {
    public static void main(String... args){
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));
    }

    public static List<String> appendA (List<String> animal) {
        for (int i = 1; i < animal.size(); i++){
            animal.set(i, animal.get(i)+ "a");
        }
        return animal;

    }
}
