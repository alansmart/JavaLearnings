package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int MinimumIntValue = Integer.MIN_VALUE;
        int MaximumIntValue = Integer.MAX_VALUE;
        System.out.println("Minimum integer value : "+ MinimumIntValue);
        System.out.println("Maximum integer value : "+ MaximumIntValue);

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;

        System.out.println("Minimum Byte value :"+ minByteValue);
        System.out.println("Maximum Byte value :"+ maxByteValue);
        long myMinlongVar = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long minimum value :"+ myMinlongVar);
        System.out.println("Long Max value : "+ myMaxLongValue);

        byte mtTotal = (byte)(myMaxLongValue/2);
        System.out.println("mt total :"+ mtTotal);

        byte newByteVar = 90;
        int newIntVar = 43432;
        short newShortVar = 324;
        long newLongVar = (5000L + 10L*(newByteVar + newShortVar + newIntVar));
        System.out.println(newLongVar);


        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Min Float value :"+ minFloatValue);
        System.out.println("Max Float value :"+ maxFloatValue);

        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("Min Double Value :"+ minDoubleValue);
        System.out.println("Max Double Value :"+ maxDoubleValue);

        float myFloatVar = (float) 5.25;
        double newDouble = 20.00d;
        double anotherDouble = 80.00d;
        double resultDouble = (newDouble + anotherDouble)*100;
        double remainder = resultDouble % 40.00d;

        boolean checkRemainder = (remainder == 0)  ? true : false;

        if(checkRemainder) {
            System.out.println("Got no remainder");
        }
    }
}
