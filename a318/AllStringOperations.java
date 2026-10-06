\*
AIM:
To write a Java program to perform various String operations such as length, character extraction, concatenation, case conversion, replacement, substring, searching, and comparison.
    
ALGORITHM:
1. Start the program.
2. Declare two strings str and str2.
3. Find the length of str.
4. Display the character at index 1.
5. Concatenate another string with str.
6. Convert str to uppercase and lowercase.
7. Replace "Java" with "World".
8. Extract a substring from str.
9. Find the index and last index of characters.
10. Check whether the string starts with "Hello" and ends with "Java".
11. Compare str and str2.
12. Stop the program.
    
PROGRAM:
public class AllStringOperations {
    public static void main(String[] args) {

        String str = "Hello Java";
        String str2 = "Hello World";

        System.out.println("Length: " + str.length());
        System.out.println("Character at index 1: " + str.charAt(1));
        System.out.println("Concatenation: " + str.concat(" Programming"));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Replace: " + str.replace("Java", "World"));
        System.out.println("Substring: " + str.substring(0, 5));
        System.out.println("Index of Java: " + str.indexOf("Java"));
        System.out.println("Last Index of a: " + str.lastIndexOf("a"));
        System.out.println("Starts with Hello: " + str.startsWith("Hello"));
        System.out.println("Ends with Java: " + str.endsWith("Java"));
        System.out.println("Equals: " + str.equals(str2));
    }
}

OUTPUT:

Length: 10
Character at index 1: e
Concatenation: Hello Java Programming
Uppercase: HELLO JAVA
Lowercase: hello java
Replace: Hello World
Substring: Hello
Index of Java: 6
Last Index of a: 9
Starts with Hello: true
Ends with Java: true
Equals: false

RESULT:
Thus, the Java program successfully performs various String operations and displays the corresponding results.






