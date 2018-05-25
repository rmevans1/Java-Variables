public class Lecture22 {
    public static void main(String[] args){
        int topScore = 80;
        int secondTopScore = 81;

        //OR Operator
        if((topScore >90) || (secondTopScore <=90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is true");

        //this should not work.
        // assigning isCar (=) the value of true in if returns true
        boolean isCar = false;
        //if(isCar = true) //should be == to check if true
        if(isCar == true)
            System.out.println("This is not supposed to happen");

        //ternary operator
        isCar = true;
        boolean wasCar = isCar ? true : false; //if is car == true wasCar = true else wasCar = false
        if(wasCar)
            System.out.println("wasCar is true");

        // 1. Create a double variable with the value 20
        // 2. Create a second variable of type double with the value 80
        // 3. Add both numbers up and multiply by 25
        // 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        // 5. Write an "if" statement that displays a message "Total was over the limit"
        //    if the remaining total (#4) is equal to 20 or less.
        double myDouble = 20;
        double mySecondDouble = 80;
        double total = (myDouble + mySecondDouble) * 25;
        System.out.println("total = " + total);
        double remainder = total % 40;
        System.out.println("Remainder is " + remainder);
        if(remainder <= 20)
            System.out.println("Total was over the limit");
    }
}
