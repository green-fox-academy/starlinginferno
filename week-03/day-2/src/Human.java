public class Human {
   private int iq;
   public static boolean alive = true;
   private static int count = 0;

    public Human(int iq) {
        this.iq = iq;
        count ++;
    }

    public boolean isSmart() {
        return this.iq > 50;  //'this' is not necessary because there are no other values
    }
    public static void changeAlive () {
        alive = false;
    }
    public int getCOunt() {
        return count;
    }

    @Override
    public String toString () {
        return "Human{" + "iq=" + iq + '}' + count;
    }
}
