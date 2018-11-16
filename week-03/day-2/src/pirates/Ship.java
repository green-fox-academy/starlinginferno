package pirates;

import java.util.ArrayList;

public class Ship {

    ArrayList<Pirate> pirateShip;

    public Ship () {

        this.pirateShip = new ArrayList<>();
    }

    public ArrayList<Pirate> getPirateShip() {
        return pirateShip;
    }


    public void fillShip() {

        int randomCrew = (int) ((Math.random() * ((15 - 11) + 1) + 11)); // (int) ((Math.random() * ((max - min) + 1) + min));

        pirateShip.add(new Pirate("Captain", (int) (Math.random() * 5), "sober"));
        for (int i = 1; i <randomCrew; i++) {
            pirateShip.add(new Pirate("Pirate", (int) (Math.random() * 5), "sober"));
        }

    }

    public boolean battle (Ship shipB) {
        int alivePiratesA = 0;
        int alivePiratesB = 0;
        int captainABooze = pirateShip.get(0).consumedRum;
        int captainBBooze = shipB.pirateShip.get(0).consumedRum;
        int scoreA = alivePiratesA - captainABooze;
        int scoreB = alivePiratesB - captainBBooze;
        int randomDeathA = (int) ((Math.random() * ((pirateShip.size()-1 - 1) + 1) + 1));  // (int) ((Math.random() * ((max - min) + 1) + min));
        int randomDeathB = (int) ((Math.random() * ((shipB.pirateShip.size()-1 - 1) + 1) + 1));

        for (int i = 0; i < pirateShip.size(); i++) {
            if (!pirateShip.get(i).state.equals("dead")) {
                alivePiratesA = alivePiratesA + 1;
            }
        }
        for (int j = 0; j < shipB.pirateShip.size(); j++) {
            if (!shipB.pirateShip.get(j).state.equals("dead")) {
                alivePiratesB = alivePiratesB + 1;
            }
        }

        if (scoreA >= scoreB) {   // this ship wins even if it's a draw because they are better B)
            for (int a = 0; a < pirateShip.size(); a++) {
                pirateShip.get(a).drinkSomeRum();
            }
            for (int b = 0; b < shipB.pirateShip.size(); b++) {
                for (int c = 0; c < shipB.pirateShip.size(); c = c + randomDeathB) {
                    shipB.pirateShip.get(c).state = "dead";
                }
            }
            return true;
        } else {
            for (int d = 0; d < shipB.pirateShip.size(); d++) {
                shipB.pirateShip.get(d).drinkSomeRum();
            }
            for (int e = 0; e < pirateShip.size(); e++) {
                for (int f = 0; f < pirateShip.size(); f = f + randomDeathA) {
                    pirateShip.get(f).state = "dead";
                }
            }
            return false;
        }
    }

}
