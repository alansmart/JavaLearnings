public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstParam, double secondParam) {
        firstParam = firstParam * 1000;
        secondParam = secondParam * 1000;

        int firstParam1 = (int)firstParam;
        int secondParam1 = (int)secondParam;

        return (firstParam1 == secondParam1);
    }
}
