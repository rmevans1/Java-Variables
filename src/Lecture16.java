public class Lecture16 {
    public static void main(String[] args) {
        /**
         * part 1: data type
         * part 2: variable name
         * part 3: variable value
         */
        int myFirstNumber = 5;
        System.out.println(myFirstNumber);

        //Variables can also have formulas
        int mySecondNumber = (10 + 5) + (2 * 10);
        System.out.println(mySecondNumber);

        int myThirdNumber = 12;
        int myFourthNumber = mySecondNumber * 2;
        int myTotal = mySecondNumber + myThirdNumber + myFourthNumber;

        System.out.println(myTotal);

        int myDifference = 1000 - myTotal;
        System.out.println(myDifference);
    }
}
