public class Lecture19 {
    public static void main(String[] args){
        char myChar = '$'; //can ony be 1 character
        char myChar2 = '\u00A9'; //copyright unicode
        System.out.println("Unicode output was: " + myChar2);

        //boolean values
        //used for testing
        boolean myBoolean = false;
        boolean isMale = true;

        //Challenge
        // 1. Find the code for the registered symbol on the same line as the copyright symbol.
        // 2. Create a variable of type char and assign it the unicode value for that symbol.
        // 3. Display it on screen.
        char registered = '\u00AE';
        System.out.println("Registered Symbol: " + registered);
    }
}
