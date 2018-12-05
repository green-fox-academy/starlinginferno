public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

            int dailyHours = 6;
            int semesterWeeks = 17;
            int semesterDays = semesterWeeks * 5;  //how many days are there in the semester
            int codingHours = semesterDays * dailyHours;   //how many hours are spent coding a semester
            int weeklyWorkHours = 52;
            int semesterWorkHours = semesterWeeks * weeklyWorkHours;  //how many work hours are there in a semester
            int codingPercentage1 = codingHours * 100 / semesterWorkHours;
            double codingPercentage2 = (double)codingHours / semesterWorkHours * 100;

            System.out.println("An attendee spends " + codingHours + " hours coding a semester.");
            System.out.println("This is " + codingPercentage1 + "% of the work hours, " + codingPercentage2 + "% to be exact.");


        }
}
