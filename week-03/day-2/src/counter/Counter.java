package counter;

public class Counter {
    int originIt = 0;
    int countIt = 0;

    public Counter() {

    }
    public Counter (int num) {
        originIt = num;
        countIt = num;
    }
    public void add(int plus) {
        this.countIt+=plus;
    }
    public void add() {
        this.countIt++;
    }
    public int get() {
     //   System.out.println(countIt);
        return countIt;
    }
    public void reset() {
        countIt = originIt;
    }
}
