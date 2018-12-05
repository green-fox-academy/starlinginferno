package quidditch;

public class Student {

    String position = "";
    String test = "";
    int score;

    public Student(String position, String test, int score) {

        this.position = position;
        this.test = test;
        this.score = score;
    }

    public void writeTest() {
        int randomTest = (int) ((Math.random() * ((100 - 1) + 1) + 1));
        if (randomTest <= 50) {
            this.test = "failed";
        } else {
            this.test = "passed";
            this.score += 20;
        }
    }

    public void catchSnitch(Student student) {
        int randomSnitch = (int) ((Math.random() * ((100 - 1) + 1) + 1));
        if (this.test.equals("passed") && student.test.equals("passed") && randomSnitch > 50) {
            this.score += 150;
        } else if (this.test.equals("passed") && student.test.equals("passed") && randomSnitch <= 50) {
            student.score += 150;
        } else if (this.test.equals("passed") && student.test.equals("failed") && randomSnitch > 50) {
            this.score += 150;
        } else if (this.test.equals("failed") && student.test.equals("passed") && randomSnitch <= 50) {
            student.score += 150;
        }
    }

}
