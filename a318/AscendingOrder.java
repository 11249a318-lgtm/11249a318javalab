\*

AIM:
To write a Java program to arrange the elements of an array in ascending order.
  
ALGORITHM:
1. Start the program.
2. Read the number of elements n.
3. Create an integer array of size n.
4. Read all the elements into the array.
5. Compare each element with the remaining elements.
6. If the first element is greater than the second element, swap them.
7. Repeat the comparison until all elements are arranged.
8. Display the elements in ascending order.
9. Stop the program.
  
CODE:
import java.util.Scanner;
public class AscendingOrder
{
    public static void main(String[] args)
    {
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements you want in array: ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending order: ");
        for (int i = 0; i < n - 1; i++)
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
        s.close();
    }
}

OUTPUT:
Enter number of elements you want in array: 5
Enter all the elements:
50
20
40
10
30
Ascending order: 10,20,30,40,50

RESULT:
Thus, the Java program successfully arranges the given array elements in ascending order.






