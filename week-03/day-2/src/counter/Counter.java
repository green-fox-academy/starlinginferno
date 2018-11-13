package counter;

public class Counter {
    int originIt;
    int countIt;

    public Counter() {
        this.countIt = 0;
    }
    public void add(int plus) {
        this.countIt+=plus;
    }
    public void add() {
        this.countIt++;
    }
    public int get() {
        System.out.println(countIt);
        return countIt;
    }
    public void reset() {
        countIt = originIt;
    }
}
