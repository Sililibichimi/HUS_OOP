import java.util.Scanner;

public class PrintDayInWord {

    public class PrintNumberInWord {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int number = sc.nextInt();

            System.out.println(changeToWordBySwitch(number));

        }

        public static String changeToWordBySwitch(int dayNumber) {

            switch (dayNumber) {

                case 1:
                    return "Monday";
                case 2:
                    return "Tuesday";
                case 3:
                    return "Wednesday";
                case 4:
                    return "Thursday";
                case 5:
                    return "Friday";
                case 6:
                    return "Saturday";
                case 0:
                    return "Sunday";
                default:
                    return "Not a valid day";
            }
        }

        public static String changeToWordByIfelse(int dayNumber) {
            if (dayNumber == 1) return "Monday";
            else if (dayNumber == 2) return "Tuesday";
            else if (dayNumber == 3) return "Webnesday";
            else if (dayNumber == 4) return "Thursday";
            else if (dayNumber == 5) return "Friday";
            else if (dayNumber == 6) return "Saturday";
            else if (dayNumber == 0) return "Sunday";
            return "Not a valid day";
        }
    }

}
