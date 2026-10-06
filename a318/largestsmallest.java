\*
Aim:
To write a Java program to find the sum, largest number, and smallest number in a given array.

Algorithm:
1.Start the program.
2.Declare and initialize an integer array with 10 elements.
3.Initialize sum = 0.
4.Set the first array element as both min and max.
5.Traverse the array from the second element to the last element.
6.If the current element is greater than max, assign it to max.
7.If the current element is smaller than min, assign it to min.
8.Add each array element to sum.
9.Display the sum of the array elements.
10.Display the largest number in the array.
11.Display the smallest number in the array
12.Stop the program.

code:
  public class largestsmallest {
    public static void main(String[] args) {
        int a[] = new int[]{23, 34, 13, 64, 72, 90, 10, 15, 9, 27};
        int sum = 0;
        int min = a[0];
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
            sum = sum + a[i];
        }
        System.out.println("The Sum is : " + sum);
        System.out.println("Largest number in a given array is: " + max);
        System.out.println("Smallest number in a given array is: " + min);
    }
}
Output:
The Sum is : 357
Largest number in a given array is: 90
Smallest number in a given array is: 9

Result:
Thus, the Java program was successfully executed to find the sum, largest number, and smallest number in the given array.




