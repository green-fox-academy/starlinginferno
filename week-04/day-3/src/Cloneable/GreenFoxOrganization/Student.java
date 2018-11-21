package Cloneable.GreenFoxOrganization;

public class Student extends Person implements Cloneable {

    String previousOrganization = "";
    int skippedDays;

    public Student (String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    @Override
    protected Student clone() {
        return new Student(name, age, gender, previousOrganization);
    }

    public Student() {

        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

/*    public Student clone() {
        Student studentClone = null;
        try {
            studentClone = (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Couldn't clone.");
        }
        return studentClone;
    }*/

    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }

    public void introduce() {
     //   super.introduce();  //doesn't work because I need a println for person but I only need print for student and mentor :(
        System.out.println("Hi, I'm " + name + ", a(n) " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }
}
