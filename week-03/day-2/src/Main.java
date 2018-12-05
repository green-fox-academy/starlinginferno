import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
  /*      FamilyMember mom = new FamilyMember("A");  //"It ran." - the new part calls the method
        FamilyMember dad = new FamilyMember("B");  //"It ran."
        mom.age = 33;  //age is a field variable from the other java class - mom is an instance of the family member class
        System.out.println(mom.age);
        System.out.println(dad.age);
        System.out.println(mom.name);
        System.out.println(dad.name);
        System.out.println(mom.surname);   */

 /* Point p1 = new Point(2, 2);
        System.out.println(p1.getX());
        p1.setX(-1);  */

        Human bob = new Human(75);  //here we are using the instance
        Human joe = new Human(22);
        System.out.println(bob.isSmart());
        System.out.println(Human.alive);  // here we are using static
        Integer.parseInt("2"); // this is a static method
        Arrays.asList(1,2,3);  // this too
        bob.alive=false;
        System.out.println(bob.alive);
        System.out.println(joe.alive);
        System.out.println(bob.toString());

    }

    public static void doubleValue (int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *=2;
        }
    }
}
