\*
AIM:
To write a Java program to check whether a given year is a Leap Year or not.
  
ALGORITHM:
1. Start the program.
2. Import the Scanner class.
3. Read the year from the user.
4. Check whether the year is divisible by 400.
5. If yes, it is a leap year.
6. Otherwise, check whether the year is divisible by 100.
7. If yes, it is not a leap year.
8. Otherwise, check whether the year is divisible by 4.
9. If yes, it is a leap year.
10. Otherwise, it is not a leap year.
11. Display the result.
12. Stop the program.
  
CODE:
import java.util.Scanner;
public class LeapYear
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter any year: ");
        int year = s.nextInt();

        boolean flag = false;

        if (year % 400 == 0)
        {
            flag = true;
        }
        else if (year % 100 == 0)
        {
            flag = false;
        }
        else if (year % 4 == 0)
        {
            flag = true;
        }
        else
        {
            flag = false;
        }

        if (flag)
        {
            System.out.println("Year " + year + " is a Leap Year");
        }
        else
        {
            System.out.println("Year " + year + " is not a Leap Year");
        }
    }
}

OUTPUT:

Example 1:
Enter any year: 2024
Year 2024 is a Leap Year

Example 2:
Enter any year: 2023
Year 2023 is not a Leap Year

RESULT:
Thus, the Java program successfully checks whether the given year is a Leap Year or not.




