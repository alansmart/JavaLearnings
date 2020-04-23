public class doWhileLoop {
    public static void main(String[] args) {
       int number = 4;
       int firstNumber = 20;
       while (number <= firstNumber) {
           number++;
           if(!isEvenNumber(number)) {
               continue;
           } else {
               System.out.println("Even Number " + number);
           }
       }
    }
    public static boolean isEvenNumber(int num) {
        if( (num % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
