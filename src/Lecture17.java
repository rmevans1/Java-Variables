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

        //byte has a width of 16
        short myShortValue = 30000; // -32768 - 32767
        short myNewShortValue = (short) (myShortValue/2);

        //long has a width of 64
        long myLongValue = 100L; // -9,223,372,036,854,775,808L - 9,223,372,036,854,775,807L
    }
}
