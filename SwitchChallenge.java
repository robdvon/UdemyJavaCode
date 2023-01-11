public class Main {
    public static void main(String[] args) {

    }

    public static class NumberOfDaysInMonth {
        public static boolean isLeapYear(int year) {
            if (year < 1 || year > 9999) {
                return false;
            }
            else {
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        return year % 400 == 0;
                    }
                    else {
                        return true;
                    }
                }
                else {
                    return false;
                }
            }
        }

        public static int getDaysInMonth(int month, int year) {
            if (month < 1 || month > 12 || year < 1 || year > 9999) {
                return -1;
            }
            else {
                switch (month) {
                    case 1, 3, 5, 7, 8, 10, 12 -> {
                        return 31;
                    }
                    case 2 -> {
                        boolean leapYear = isLeapYear(year);
                        if (leapYear) {
                            return 29;
                        } else {
                            return 28;
                        }
                    }
                    case 4, 6, 9, 11 -> {
                        return 30;
                    }
                    default -> {
                        return -1;
                    }
                }
            }
        }
    }
}
