public class Main {
    public static void main (String[] args){
        System.out.println(getDurationString(5431));
        System.out.println(getDurationString(236));
        System.out.println(getDurationString(4284));
        System.out.println(getDurationString(-2));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(-1, 45));
        System.out.println(getDurationString(1, -1));
        System.out.println(getDurationString(1, 60));
        System.out.println(getDurationString(1, 59));
    }

    public static String getDurationString(int seconds){
        if (seconds < 0){
            return "Seconds argument must be positive";
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }

    public static String getDurationString(int minutes, int seconds){
        if (minutes < 0 || seconds < 0 || seconds > 59){
            return "Minutes are negative or seconds go past their limits < 0 or > 59";
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + "h" + remainingMinutes + "m" + seconds + "s";
    }
}
