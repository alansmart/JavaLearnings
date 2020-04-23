public class secondsAndMinutes {
    public static double getDurationString(double minutes, double seconds) {
        double hours = 0;
        if((minutes >= 0) && ((seconds >= 0) || (seconds <= 59))) {
            return -1;
        } else {
            hours = minutes*60;
        }
        return hours;
    }
}
