package pirates;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Ship ship = new Ship();
  //      ship.pirateShip = new ArrayList<>();

        ship.fillShip();



        System.out.println(ship.pirateShip.size());

        ship.pirateShip.get(2).drinkSomeRum();
        ship.pirateShip.get(2).drinkSomeRum();
        ship.pirateShip.get(2).drinkSomeRum();
        ship.pirateShip.get(2).howsItGoingMate();

     //   ship.pirateShip.get(4).state = "dead";

        ship.pirateShip.get(4).brawl(ship.pirateShip.get(7));

        int randomDeathA = (int) (Math.random() * ship.pirateShip.size());
        for (int b = 0; b < ship.pirateShip.size(); b++) {
            for (int c = 0; c < ship.pirateShip.size(); c = c + randomDeathA) {
                ship.pirateShip.get(c).state = "dead";
            }
            System.out.println(ship.pirateShip.get(b).state);
        }

/*        for (int i = 0; i < ship.pirateShip.size(); i++) {

            System.out.println(ship.pirateShip.get(i).rank + i + " has drunk " + ship.pirateShip.get(i).consumedRum + " bottles of rum, and is " + ship.pirateShip.get(i).state);

        }*/


    }
}
