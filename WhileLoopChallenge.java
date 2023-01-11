public class Main {
    public static void main(String[] args) {

        int start = 4;
        int evenCount = 0;
        int oddCount = 0;

        while (start <= 20) {
            start++;
            if (isEvenNumber(start)) {
                evenCount++;
                System.out.println(start);
                if (evenCount == 5) {
                    continue;
                 }
            } else if (!isEvenNumber(start)) {
                oddCount++;
            }
        }
        System.out.println("Evens are " + evenCount) ;
        System.out.println("Odds are " + oddCount);
    }
    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
