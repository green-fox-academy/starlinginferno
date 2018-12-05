package MatRev.garden;

public class Main {
    public static void main(String[] args) {

        try {
            Garden garden = new Garden() ;
            garden.add(null);
        } catch (NullPlantException e) {
            System.out.println(e.getMessage());
        }
    }
}
