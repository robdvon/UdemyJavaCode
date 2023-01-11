public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double numberA, double numberB){
        numberA = (int) (numberA * 1000);
        numberB = (int) (numberB * 1000);

        return numberA == numberB;
    }
}

