public class Main {
    public static void main(String[] args) {
       System.out.println(isOdd(7));
       System.out.println(sumOdd(2, 5));
    }
    public static boolean isOdd(int number) {

        if (number < 0) {
            return false;
        } else return number % 2 == 1;
    }
    public static int sumOdd(int start, int end) {

        int sum = 0;

        if (end < start || start < 0) {
            return -1;
        } else {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
        } return sum;
    }
}
