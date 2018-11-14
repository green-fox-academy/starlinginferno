package teachersandstudents;

public class Student {
    int iq;
    Teacher msCooper = new Teacher();


    public Student () {
        this.iq = 50;
    }
    public void learn () {
    iq++;
    }
    public void question() {
        msCooper.answer();
        msCooper.teach();
    }
}

