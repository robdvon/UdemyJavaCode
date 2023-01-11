public class SecondAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
    }
    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid Time!";
        }
            int hour = (seconds / 3600);
            int minute = (seconds - (hour * 3600)) / 60;
            int secondsRemaining = seconds - (hour * 3600) - (minute * 60);
            return hour + "h " + minute + "m " + secondsRemaining + "s";
    }
    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0 || seconds >= 59)) {
            return "Invalid Time!";
        }
            int convertToSeconds = minutes * 60 + seconds;
            return getDurationString(convertToSeconds);
    }
}
