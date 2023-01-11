public class Main {
    public static void main(String[] args) {

//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2){
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }
        int switchValue = 3;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Was actually a " + switchValue);
            }
            default -> System.out.println("Was not 1 or 2");
        }
        //more code here
    }

    public static String getQuarter(String month) {

        switch (month) {
            case "January", "February", "March" -> {
                return "1st";
            }
            case "April", "May", "June" -> {
                return "2nd'";
            }
            case "July", "August", "September" -> {
                return "3rd";
            }
            case "October", "November", "December" -> {
                return "4th";
            }
            default -> {
                    yield month + " is bad";
                }
            };
        }
    }
}
