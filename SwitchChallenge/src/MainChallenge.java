public class MainChallenge {
    public static void main (String[] args){
        int day = 0;
        String dayOfTheWeek = printDayOfWeek(day);
        System.out.println("Day " + day + " is " + dayOfTheWeek);

        day = 1;
        dayOfTheWeek = printDayOfWeek(day);
        System.out.println("Day " + day + " is " + dayOfTheWeek);

        day = 2;
        dayOfTheWeek = printDayOfWeek(day);
        System.out.println("Day " + day + " is " + dayOfTheWeek);

        day = 3;
        dayOfTheWeek = printDayOfWeek(day);
        System.out.println("Day " + day + " is " + dayOfTheWeek);

        day = 4;
        dayOfTheWeek = printDayOfWeek(day);
        System.out.println("Day " + day + " is " + dayOfTheWeek);

        day = 5;
        dayOfTheWeek = printDayOfWeek(day);
        System.out.println("Day " + day + " is " + dayOfTheWeek);

        day = 6;
        dayOfTheWeek = printDayOfWeek(day);
        System.out.println("Day " + day + " is " + dayOfTheWeek);

        day = 7;
        dayOfTheWeek = printDayOfWeek(day);
        System.out.println("Day " + day + " is " + dayOfTheWeek);

        day = 0;
        dayOfTheWeek = printWeekDay(day);
        System.out.println("Day " + day + " is " + dayOfTheWeek);

        day = 1;
        dayOfTheWeek = printWeekDay(day);
        System.out.println("Day " + day + " is " + dayOfTheWeek);

        day = 2;
        dayOfTheWeek = printWeekDay(day);
        System.out.println("Day " + day + " is " + dayOfTheWeek);

        day = 3;
        dayOfTheWeek = printWeekDay(day);
        System.out.println("Day " + day + " is " + dayOfTheWeek);

        day = 4;
        dayOfTheWeek = printWeekDay(day);
        System.out.println("Day " + day + " is " + dayOfTheWeek);

        day = 5;
        dayOfTheWeek = printWeekDay(day);
        System.out.println("Day " + day + " is " + dayOfTheWeek);

        day = 6;
        dayOfTheWeek = printWeekDay(day);
        System.out.println("Day " + day + " is " + dayOfTheWeek);

        day = 7;
        dayOfTheWeek = printWeekDay(day);
        System.out.println("Day " + day + " is " + dayOfTheWeek);
    }


    public static String printDayOfWeek(int day){
        return switch(day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };
    }

    public static String printWeekDay(int day){
        if (day == 0){
            return "Sunday";
        } else if (day == 1){
            return "Monday";
        } else if (day == 2){
            return "Tuesday";
        } else if (day == 3){
            return "Wednesday";
        } else if (day == 4){
            return "Thursday";
        } else if (day == 5){
            return "Friday";
        } else if (day == 6){
            return "Saturday";
        }

        return "Invalid day";
    }
}
