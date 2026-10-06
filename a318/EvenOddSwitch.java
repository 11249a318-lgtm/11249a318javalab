\*
AIM
To write a Java program to check whether a given number is even or odd using a switch statement.
ALGORITHM
1. Start the program.
2. Import the Scanner class.
3. Read an integer n from the user.
4. Find the remainder using n % 2.
5. Use a switch statement:
   - If the remainder is 0, the number is even.
   - If the remainder is 1, the number is odd.
6. Display the result.
7. Stop the program.
CODE
import java.util.*;
class EvenOddSwitch
{
    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        switch(n % 2)
        {
            case 0:
                System.out.println("This number is even");
                break;
            case 1:
                System.out.println("This number is odd");
                break;
        }
        s.close();
    }
}

OUTPUT:

Example 1:
10
This number is even

Example 2:
7
This number is odd

RESULT:
Thus, the Java program successfully checks whether the given number is even or odd using the switch statement.




