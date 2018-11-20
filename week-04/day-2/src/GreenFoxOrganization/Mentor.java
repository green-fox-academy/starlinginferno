package GreenFoxOrganization;

public class Mentor extends Person {

    String level = "";  // junior / intermediate / senior


    public Mentor (String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public Mentor() {

        level = "intermediate";
    }

    public void getGoal() {
        System.out.println("My goal is: Educate brilliant junior software developers.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a(n) " + age + " year old " + gender + " " + level + " mentor.");
    }
}
