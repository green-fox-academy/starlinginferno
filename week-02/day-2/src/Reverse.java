public class Reverse {
    public static void main(String... args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.



        System.out.println(reverse(reversed));
    }
    public static String reverse (String x) {
        String y = "";
        for (int i= x.length()-1; i >=0; i--) {
            y = y + x.charAt(i);
            //      System.out.print(x.charAt(i));

        }
        return y;
    }
}

/* alternative solution

int length = reversed.length();
        String back = "";

        for (int i = length-1; i >= 0; i--) {
            back = back + reversed.charAt(i);}


        System.out.println(back);
 */