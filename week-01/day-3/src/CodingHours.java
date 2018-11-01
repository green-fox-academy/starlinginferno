public class CodingHours {
    public static void main(String[] args) {
        int dailyHours = 6;
        int semesterWeeks = 17;
        int workHoursPerWeek = 52;
        int workdaysPerWeek = 5;

        int workdaysPerSemester = (semesterWeeks * workdaysPerWeek);
        int codingHours = (dailyHours * workdaysPerSemester);

        System.out.println(codingHours + " hours are spent with coding in a semester by an attendee");

        int workHoursPerSemester = (semesterWeeks * workHoursPerWeek);
        double percentage = ((double)codingHours / workHoursPerSemester) * 100;

        System.out.println("The percentage of the coding hours in the semester is " + percentage + " %");






    }
}
