public class calFeetAndInchesIntoCentimeters {
    public static void main(String[] args) {
        calcFeetAndInches(6, 0);
        calcFeetAndInches(100);
    }
    // 1 inch = 2.54 centimeters;
        // 1 feet = 12 inches;
    public static double calcFeetAndInches(double feet, double inches) {
        if((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet or Inches");
            return -1;
        } else {
           double centimeters = (feet * 12)*2.54;
            centimeters += inches*2.54;
            System.out.println(feet + " feet " + inches + " inches " + centimeters + "centimeters ");
            return centimeters;
        }
    }

    public static double calcFeetAndInches(double inches) {
        if(inches < 0) {
            return -1;
        }
        double feet = (int)inches / 12;
        double remainingInches = (int)inches % 12;
        System.out.println(inches + " Inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInches(feet, remainingInches);
    }
}
