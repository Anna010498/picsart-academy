package Homeworks;

public class FirstHomework {
    public static void main(String[] args) {
        byte myByt = 100;
        int myNum = 25;
        short myShortNum = 28100;
        long myLongNum = 301L;
        float myFloatNum = 12.25f;
        double myDoubleNum = 221.16d;
        boolean myBool = true;
        char myChar = 'A';
        int sumWholeNum = myByt + myNum;
        int multipWholeNum = myNum * myByt;
        int subWholeNum1 = myByt - myNum;
        int subWholeNum2 = myNum - myByt;
        int divWholeNum = myByt / myNum;
        // int wholeSum = myByt + myNum + myShortNum + myLongNum;

        System.out.println("The sum of whole numbers is: " + sumWholeNum);
        System.out.println("The multiplication of whole numbers is: " + multipWholeNum);
        System.out.println("These are subtraction examples: " + subWholeNum1 + " and " + subWholeNum2);
        System.out.println("The division of whole numbers is: " + divWholeNum);
        //System.out.println("This is the whole sum: " + myByt + myNum + myShortNum + myLongNum);
        System.out.println(myByt + myNum + myShortNum + myLongNum);
        System.out.println(myChar + myNum); // A is 65 in ASCII table, so 65+25=90
        System.out.println(myFloatNum + myDoubleNum); // not working with string

        System.out.println("Other whole numbers are: " + myShortNum + " and " + myLongNum);
        System.out.println("There are also fractional numbers: " + myFloatNum + " and " + myDoubleNum);
        System.out.println("All the above calculations are: " + myBool);
        System.out.println("My full name starts with " + myChar);


    }
}