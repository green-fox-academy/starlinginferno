public class SecondsInADay {
    public static void main(String[] args) {

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int currentSecondsTotal = currentHours * 60 * 60 + currentMinutes * 60 + currentSeconds;
        int secondsInADay = 24 * 60 * 60;

        int remainingSeconds = secondsInADay - currentSecondsTotal;

        System.out.println(remainingSeconds + " seconds are left of the day.");

    }
}
