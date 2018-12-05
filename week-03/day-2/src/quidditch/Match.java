package quidditch;


import java.util.ArrayList;

public class Match {
    public static void main(String[] args) {

        Team gryffindor = new Team();
        gryffindor.quidditchTeam = new ArrayList<>();
        gryffindor.fillTeam();

        System.out.println(gryffindor.quidditchTeam.get(0).position + " " + gryffindor.quidditchTeam.get(0).test + " " + gryffindor.quidditchTeam.get(0).score);
        System.out.println(gryffindor.quidditchTeam.get(1).position + " " + gryffindor.quidditchTeam.get(1).test + " " + gryffindor.quidditchTeam.get(1).score);
        System.out.println(gryffindor.quidditchTeam.get(2).position + " " + gryffindor.quidditchTeam.get(2).test + " " + gryffindor.quidditchTeam.get(2).score);
        System.out.println(gryffindor.quidditchTeam.get(5).position + " " + gryffindor.quidditchTeam.get(5).test + " " + gryffindor.quidditchTeam.get(5).score);

        for (int i = 0; i < gryffindor.quidditchTeam.size(); i++) {
            gryffindor.quidditchTeam.get(i).writeTest();
            System.out.println("Gryffindor " + gryffindor.quidditchTeam.get(i).position + " wrote a test and " + gryffindor.quidditchTeam.get(i).test);
        }

        Team slytherin = new Team();
        slytherin.quidditchTeam = new ArrayList<>();
        slytherin.fillTeam();

        for (int j = 0; j < slytherin.quidditchTeam.size(); j++) {
            slytherin.quidditchTeam.get(j).writeTest();
            System.out.println("Slytherin " + slytherin.quidditchTeam.get(j).position + " wrote a test and " + slytherin.quidditchTeam.get(j).test);
        }

        System.out.println("The score is: ");
   //     gryffindor.quidditchMatch(slytherin);

        if (gryffindor.quidditchMatch(slytherin) == true) {
            System.out.println("The winner is Gryffindor!");
        } else {
            System.out.println("The winner is Slytherin!");
        }
    }
}
