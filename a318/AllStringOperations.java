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
        System.out.println("Ends with Java: " +
