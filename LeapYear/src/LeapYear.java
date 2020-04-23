public class LeapYear {
    public static boolean isLeapYear(int yearNumber) {
        if(yearNumber >= 1 && yearNumber <= 9999) {
            boolean leapYear = false;
            if(yearNumber % 4 == 0) {
                if(yearNumber % 100 == 0) {
                    if(yearNumber % 400 == 0) {
                        return  leapYear = true;
                    } else {
                        return leapYear = false;
                    }
                } else {
                    return leapYear = true;
                }
            } else {
                return leapYear;
            }
        } else {
            return false;
        }
    }
}
