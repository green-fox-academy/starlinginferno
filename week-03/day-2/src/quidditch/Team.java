package quidditch;

import java.util.ArrayList;

public class Team {
    ArrayList<Student> quidditchTeam;

    public Team() {

        this.quidditchTeam = new ArrayList<>();
    }

    public void fillTeam() {

        quidditchTeam.add(new Student("Seeker", "passed", 0));
        quidditchTeam.add(new Student("Keeper", "passed", 0));
        quidditchTeam.add(new Student("Chaser", "passed", 0));
        quidditchTeam.add(new Student("Chaser", "passed", 0));
        quidditchTeam.add(new Student("Chaser", "passed", 0));
        quidditchTeam.add(new Student("Beater", "passed", 0));
        quidditchTeam.add(new Student("Beater", "passed", 0));
    }

    public boolean quidditchMatch (Team team) {
        int scoreA = 0;
        int scoreB = 0;
        this.quidditchTeam.get(0).catchSnitch(team.quidditchTeam.get(0));

        for (int i = 0; i < this.quidditchTeam.size(); i++) {
            scoreA = scoreA + this.quidditchTeam.get(i).score;
        }
        for (int j = 0; j < team.quidditchTeam.size(); j++) {
            scoreB = scoreB + team.quidditchTeam.get(j).score;
        }
        System.out.println(scoreA + " : " + scoreB);
        if (scoreA > scoreB) {
            return true;
        } else {
            return false;
        }
    }
}
