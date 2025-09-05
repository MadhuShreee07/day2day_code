package MODULE1;

public class String_functions {

    public static void showStringFunctions() {
        
        // length() - Returns the length of the string
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        // charAt() - Returns the character at the specified index (position)
        String myStrChar = "Hello";
        char result = myStrChar.charAt(0);
        System.out.println(result);

        // compareTo() - Compares two strings lexicographically
        String myStr1 = "Hello";
        String myStr2 = "Hello";
        System.out.println(myStr1.compareTo(myStr2)); // Returns 0 because they are equal

        // compareToIgnoreCase() - Compares two strings lexicographically, ignoring case differences
        String myStr3 = "HELLO";
        String myStr4 = "hello";
        System.out.println(myStr3.compareToIgnoreCase(myStr4)); // Returns 0

        // concat() - Appends a string to the end of another string
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));

        String newname = "";
        newname = firstName.concat(lastName);
        System.out.println(newname);

        // contains() - Checks whether a string contains a sequence of characters
        String myStrContains = "Hello";
        System.out.println(myStrContains.contains("Hel")); // true
        System.out.println(myStrContains.contains("e"));   // true
        System.out.println(myStrContains.contains("Hi"));  // false

        // equals() - Compares two strings for equality
        String myStr5 = "Hello";
        String myStr6 = "Hello";
        String myStr7 = "Another String";
        System.out.println(myStr5.equals(myStr6)); // true
        System.out.println(myStr5.equals(myStr7)); // false

        // indexOf() - Returns the position of the first occurrence of specified text
        String myStrIndex = "Hello planet earth, you are a great planet.";
        System.out.println(myStrIndex.indexOf("planet")); // Outputs 6

        // replace() - Replaces characters in the string
        String myStrReplace = "Hello";
        System.out.println(myStrReplace.replace('l', 'p')); // Outputs Heppo

        // substring() - Returns a part of the string
        String myStrSub = "Hello, World!";
        System.out.println(myStrSub.substring(7, 12)); // Outputs World

        // toUpperCase() and toLowerCase() - Converts string to upper/lower case
        String txtCase = "Hello World";
        System.out.println(txtCase.toUpperCase());
        System.out.println(txtCase.toLowerCase());

        // trim() - Removes whitespace from both ends of a string
        String myStrTrim = " Hello World! ";
        System.out.println(myStrTrim);
        System.out.println(myStrTrim.trim());
    }

    public static void main(String[] args) {
        showStringFunctions();
    }
}
