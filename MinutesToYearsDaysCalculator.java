public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(5677888);
    }
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int years = (int) minutes / 525_600;
            int days = (int) (minutes - (years * 525_600)) / 1440;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
