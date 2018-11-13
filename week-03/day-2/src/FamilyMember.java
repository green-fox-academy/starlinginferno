public class FamilyMember {
    String name;   //field variables - not local variables in the other java class (main)
    int age;
    String surname;

    public FamilyMember(String surname) {
        System.out.println("It ran.");
        name = "Something";
        age = 18;
        this.surname = surname;   //otherwise it will be null without the 'this'
    }
}