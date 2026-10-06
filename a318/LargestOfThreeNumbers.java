\*
AIM:
To write a Java program to find the largest of three numbers using if-else statements.
  
ALGORITHM:
1. Start the program.
2. Import the Scanner class.
3. Declare three integer variables x, y, and z.
4. Read three numbers from the user.
5. Compare x with y and z.
6. If x is greater than both, display First number is largest.
7. Otherwise, compare y with x and z.
8. If y is greater than both, display Second number is largest.
9. Otherwise, compare z with x and y.
10. If z is greater than both, display Third number is largest.
11. If the numbers are equal, display The numbers are not distinct.
12. Stop the program.
  
CODE:
import java.util.Scanner;
class LargestOfThreeNumbers
{
    public static void main(String args[])
    {
        int x, y, z;
        System.out.println("Enter three integers");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        if (x > y && x > z)
            System.out.println("First number is largest.");
        else if (y > x && y > z)
            System.out.println("Second number is largest.");
        else if (z > x && z > y)
            System.out.println("Third number is largest.");
        else
            System.out.println("The numbers are not distinct.");
    }
}

OUTPUT:

Example 1:
Enter three integers
10
25
15
Second number is largest.

Example 2:
Enter three integers
30
20
40
Third number is largest.

RESULT
Thus, the Java program successfully finds the largest of three numbers using if-else statements.





