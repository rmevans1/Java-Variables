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
    }
}
