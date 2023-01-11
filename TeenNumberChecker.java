public class TeenNumberChecker {
    public static boolean hasTeen(int a, int b, int c) {
        if ((a >= 13) || (b >= 13) || (c >= 13)){
            return (a <= 19) || (b <= 19) || (c <= 19);
        }
        return false;
    }
    public static boolean isTeen(int number){
        return (number >= 13) && (number <= 19);
    }
}
