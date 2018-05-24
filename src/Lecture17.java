public class Lecture17 {
    public static void main(String[] args) {

        //int has a width of 32
        int myMinValue = -2_147_483_648; //min integer
        int myMaxValue = 2_147_483_647;  //max integer
        int myTotal = (myMinValue/2); //arithmetic example
        System.out.println("myTotal = " + myTotal);

        //byte has a width of 8
        byte myByteValue = -128; //-128 - 127
        byte myNewByteValue = (byte) (myByteValue/2); //arithmetic example- must cast to byte
        System.out.println("myNewByteValue = " + myNewByteValue);

        //short has a width of 16
        short myShortValue = 30000; // -32768 - 32767
        short myNewShortValue = (short) (myShortValue/2);

        //long has a width of 64
        long myLongValue = 100L; // -9,223,372,036,854,775,808L - 9,223,372,036,854,775,807L

        /**
         * Challenge:
         * 1. Create a byte variable and set it to any valid byte number
         * 2. Create a short variable and set it to any valid short number.
         * 3. Create a int variable and set it to any valid int number.
         * 4. Create a variable of type long, and make it equal to
         *    50000 + 10 times the sum of the byte, plus the short plus the int
         */

        byte theByte = 120;
        short theShort = 25_000;
        int theInt = -3_457_198;
        long theLong = 50_000L + (10L * (theByte + theShort + theInt));
        System.out.println("theLong = " + theLong);
    }
}
