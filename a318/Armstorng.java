\*
AIM:
To write a Java program to check whether a given number is an Armstrong number or not.
    
ALGORITHM:
1. Start the program.
2. Read a number n from the user.
3. Store the original number in nu.
4. Initialize num = 0.
5. Extract the last digit using nu % 10.
6. Find the cube of the digit and add it to num.
7. Remove the last digit using nu / 10.
8. Repeat steps 5–7 until nu becomes 0.
9. Compare num with the original number n.
10. If both are equal, display Armstrong Number.
11. Otherwise, display Not an Armstrong Number.
12. Stop the program.
    
CODE:
import java.util.Scanner;
public class Armstorng {
    public static void main(String[] args) {
        int n, nu, num = 0, rem;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        nu = n;
        while (nu != 0) {
            rem = nu % 10;
            num = num + (rem * rem * rem);
            nu = nu / 10;
        }
        if (num == n) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}

OUTPUT:
Example 1
Enter a number: 153
Armstrong Number
Example 2
Enter a number: 123
Not an Armstrong Number

RESULT:
Thus, the Java program successfully checks whether the given three-digit number is an Armstrong number or not.





import java.util.Scanner;

public class Armstorng {
    public static void main(String[] args) {

        int n, nu, num = 0, rem;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        nu = n;

        while (nu != 0) {
            rem = nu % 10;
            num = num + (rem * rem * rem);
            nu = nu / 10;
        }

        if (num == n) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
