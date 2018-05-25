public class Lecture21 {
    public static void main(String[] args) {
        int result = 1 + 2; //operators =,+
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1; //operators =,-
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result); //4
        result *= 10;
        System.out.println("Result is now " + result); //40
        result -= 10;
        System.out.println("Result is now " + result); //30
        result /= 10;
        System.out.println("Result is now " + result); //3

        boolean isAlien = false;
        if(isAlien == false) //checks if isAlien is false (==)
            System.out.println("It is not an alien!");

        int topScore = 100;
        if(topScore == 100)
            System.out.println("You got the high score!");
    }
}
