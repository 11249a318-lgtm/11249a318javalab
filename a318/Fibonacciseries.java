\*
AIM:

To write a Java program to generate the Fibonacci series for a given number of terms.
ALGORITHM:
1. Start the program.
2. Import the Scanner class.
3. Read the number of terms n from the user.
4. Call the Fibonacci() method.
5. If n is 0, print 0.
6. If n is 1, print 0 1.
7. Otherwise, initialize a = 0 and b = 1.
8. Print 0 1.
9. Find the next number by adding a + b.
10. Print the next number and update a and b.
11. Repeat until the required number of terms is printed.
12. Stop the program.
    
CODE:
import java.util.Scanner;
public class Fibonacciseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        Fibonacci(n);
    }
    public static void Fibonacci(int n) {
        if (n == 0) {
            System.out.println("0");
        } 
        else if (n == 1) {
            System.out.println("0 1");
        } 
        else {
            System.out.println("0 1");
            int a = 0;
            int b = 1;
            for (int i = 1; i < n - 1; i++) {
                int nextnumber = a + b;
                System.out.print(nextnumber + " ");
                a = b;
                b = nextnumber;
            }
        }
    }
}

OUTPUT:

Example
Enter the value of n: 7
0 1
1 2 3 5 8

The Fibonacci series is:
0 1 1 2 3 5 8

RESULT:
Thus, the Java program successfully generates the Fibonacci series for the given number of terms.



