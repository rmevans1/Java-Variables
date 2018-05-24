public class Lecture18 {
    public static void main(String[] args){
        /**
         * width of int = 32 (4 bytes)
         * width of float = 32 (4 bytes)
         * width of double = 64 (8 bytes)
         */

        int myIntValue = 5;
        float myFloatValue = 5f;
        double myDoubleValue = 5d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //Divide by 2
        int myIntValue2 = 5 / 2;
        float myFloatValue2 = 5f / 2f;
        double myDoubleValue2 = 5d / 2d;
        System.out.println("myIntValue2 = " + myIntValue2);         //2
        System.out.println("myFloatValue2 = " + myFloatValue2);     //2.5
        System.out.println("myDoubleValue2 = " + myDoubleValue2);   //2.5

        //Divide by 3
        int myIntValue3 = 5 / 3;
        float myFloatValue3 = 5f / 3f;
        double myDoubleValue3 = 5d / 3d;
        System.out.println("myIntValue3 = " + myIntValue3);         //1
        System.out.println("myFloatValue3 = " + myFloatValue3);     //1.6666666
        System.out.println("myDoubleValue3 = " + myDoubleValue3);   //1.6666666666666667

        /**
         * Convert a given number of pounds to kilograms
         * 1. Create a variable to store the number of pounds
         * 2. Calculate the number of kilograms for the number above and store in a variable
         * 3. Print out the result.
         *
         * NOTES: 1 pound is equal to 0.45359237 kilograms
         */

        double pounds = 120d;
        double kilograms = pounds * 0.45359237d;
        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms");
    }
}
