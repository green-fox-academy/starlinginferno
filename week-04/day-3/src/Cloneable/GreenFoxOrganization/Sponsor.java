package Cloneable.GreenFoxOrganization;

public class Sponsor extends Person {

    String company = "";
    int hiredStudents;

    public Sponsor (String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    public Sponsor() {

        this.company = "Google";
        this.hiredStudents = 0;
    }

    public void introduce() {
        super.introduce();
        System.out.println("Hi, I'm " + name + ", a(n) " + age + " year old " + gender + " who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

    public void hire() {
        hiredStudents++;
    }

    public void getGoal() {
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }
}
