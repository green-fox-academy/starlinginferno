package pirates;

import java.util.ArrayList;

public class BattleApp {
    public static void main(String[] args) {

        Ship walrus = new Ship();
        walrus.pirateShip = new ArrayList<>();

        walrus.fillShip();

        Ship urca = new Ship();
        urca.pirateShip = new ArrayList<>();

        urca.fillShip();

        System.out.println(walrus.pirateShip.size());
        System.out.println(walrus.battle(urca));



    }
}
