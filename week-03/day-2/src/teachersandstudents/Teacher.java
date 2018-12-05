package teachersandstudents;

public class Teacher {
    int patience;
    Student eugene = new Student();

    public Teacher (){
        this.patience = 100;
    }

    public void teach() {
        for (int i = 0; i < 5; i++) {
            eugene.learn(); }
        System.out.println(eugene.iq);
    }

    public void answer() {
        patience--;
    }

}

