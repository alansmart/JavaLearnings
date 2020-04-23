public class SpeedConverter {
    public static long toMilesPerHour(double kilomtersPerHour) {
      if(kilomtersPerHour < 0) {
          return -1;
      }
        return Math.round(kilomtersPerHour / 1.609);
    }

    public static void printConversion(double kilometerPerHour) {
        if(kilometerPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometerPerHour);
            System.out.println(kilometerPerHour + "km/h =" + milesPerHour + " mi/h");
        }
    }
}

