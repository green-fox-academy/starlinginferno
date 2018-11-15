package pirates;

public class Pirate {

    String rank = "";
    int consumedRum;
    String state = "";

    public Pirate(String rank, int consumedRum, String state) {

        this.rank = rank;
        this.consumedRum = consumedRum;
        this.state = state;
    }

    public void drinkSomeRum() {
        this.consumedRum++;
        if (this.state.equals("dead")) {
            this.state = "dead";
        } else if (this.consumedRum > 4) {
            this.state = "passed out";
        } else {
            this.state = "sober";
        }
    }

    public void howsItGoingMate() {
        System.out.println("How's it goin' mate?");
        if(this.consumedRum > 4) {
            this.state = "passed out";
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        } else if (this.consumedRum <= 4) {
            this.state = "sober";
            System.out.println("Pour me anudder!");
        }
    }

    public void die() {
        this.state = "dead";
    }

    public void brawl(Pirate pirateB) {
     //   Pirate pirateA = new Pirate(rank, consumedRum, state);
        int randomBrawl = (int) (Math.random() * 3);
        if (state.equals("sober") && pirateB.state.equals("sober")) {
            if (randomBrawl == 0) {
                die();
                System.out.println("The first pirate died.");
            } else if (randomBrawl == 1) {
                pirateB.die();
                System.out.println("The second pirate died.");
            } else {
                state = "passed out";
                pirateB.state = "passed out";
                System.out.println("They both passed out.");
            }
        }
    }

}
