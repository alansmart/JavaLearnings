public class sumOfDigits {

    public static int someODigit(int number) {
        if(number < 10) {
            return  -1;
        }
        int sum = 0;
        while (number > 0) {
            // extract the least significant value
            int firstNumber = number%10;
            sum += firstNumber;
            // discard the least significant value
            firstNumber /= 10;  // same as firstNumber = firstNumber /10
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("sum of the number 125 is " + someODigit(125));
       // System.out.println("sum of the number -4 is " + someODigit(-4));
      //  System.out.println("sum of the number 2000 is " + someODigit(2000));
       // System.out.println("sum of the number 1 is " + someODigit(1));

    }
}
