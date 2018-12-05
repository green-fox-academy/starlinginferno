package pirates;

import java.util.ArrayList;

public class BattleApp {
    public static void main(String[] args) {

        Ship walrus = new Ship();
        walrus.pirateShip = new ArrayList<>();
        walrus.fillShip();

        System.out.println("Once upon a time there was a pirate ship, the Walrus, with a crew of " + walrus.pirateShip.size() + ", led by the fearsome Captain Flint.");

        System.out.println("He and his crew were sitting in the pub in the morning, hungover, but mostly sober after a night of partying.");
        for (int i = 0; i < walrus.pirateShip.size(); i++) {
            System.out.println(walrus.pirateShip.get(i).rank + " " + i + " had " + walrus.pirateShip.get(i).consumedRum + " shots of rum in them and was " + walrus.pirateShip.get(i).state + ".");
        }

        Ship ranger = new Ship();
        ranger.pirateShip = new ArrayList<>();
        ranger.fillShip();

        System.out.println("But then they heard the familiar noise of cannonballs fired outside. It was their enemy, Captain Vane of the Ranger, with a crew of " + ranger.pirateShip.size() + ".");
        System.out.println("They were prepared for a fight.");

        for (int j = 0; j < ranger.pirateShip.size(); j++) {
            System.out.println("Ranger " + ranger.pirateShip.get(j).rank + " " + j + " had " + ranger.pirateShip.get(j).consumedRum + " shots of rum in them and was " + ranger.pirateShip.get(j).state);
        }

        System.out.println("There was no turning back. The battle had started.");

        walrus.battle(ranger);

        if (walrus.battle(ranger) == true) {
            System.out.println("The Walrus won and they had a celebration with lots of rum.");
            for (int k = 0; k < walrus.pirateShip.size(); k++) {
                System.out.println(walrus.pirateShip.get(k).rank + " " + k + " had " + walrus.pirateShip.get(k).consumedRum + " shots of rum in them and was " + walrus.pirateShip.get(k).state + ".");
            }
            System.out.println("The Ranger had some casualties.");
            for (int l = 0; l < ranger.pirateShip.size(); l++) {
                System.out.println("Ranger " + ranger.pirateShip.get(l).rank + " " + l + " had " + ranger.pirateShip.get(l).consumedRum + " shots of rum in them and was " + ranger.pirateShip.get(l).state);
            }
        } else {
            System.out.println("The Ranger won and they had a celebration with lots of rum.");
            for (int m = 0; m < ranger.pirateShip.size(); m++) {
                System.out.println("Ranger " + ranger.pirateShip.get(m).rank + " " + m + " had " + ranger.pirateShip.get(m).consumedRum + " shots of rum in them and was " + ranger.pirateShip.get(m).state);
            }
            System.out.println("The Walrus had some casualties.");
            for (int n = 0; n < walrus.pirateShip.size(); n++) {
                System.out.println(walrus.pirateShip.get(n).rank + " " + n + " had " + walrus.pirateShip.get(n).consumedRum + " shots of rum in them and was " + walrus.pirateShip.get(n).state + ".");
            }
        }



    }
}
