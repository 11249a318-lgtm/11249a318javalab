\*
AIM:
To write a Java program to search for an element in an array using the Binary Search technique.
  
ALGORITHM:

1. Start the program.
2. Read the number of elements n.
3. Create an integer array of size n.
4. Read the array elements.
5. Read the element x to be searched.
6. Set first = 0 and last = n - 1.
7. Find the middle element using mid = (first + last) / 2.
8. Compare a[mid] with the search element x.
9. If a[mid] > x, search the left half.
10. If a[mid] < x, search the right half.
11. If a[mid] == x, display "element found".
12. If the element is not found, display "element not found".
13. Stop the program.

code:

import java.util.Scanner;
class BinarySearch
{
public static void main(String ar[])
{ int i,mid,first,last,x,n,flag=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of elements:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter elements of array:");
for(i=0;i<n;++i)
a[i]=sc.nextInt();
System.out.println("Enter element to search:");
x=sc.nextInt();
first=0;
last=n-1;
while(first<=last)
{
mid=(first+last)/2;
if(a[mid]>x)
last=mid-1;
else
if(a[mid]<x)
first=mid+1;
else
{
flag=1;
System.out.println("element found");
break;
}
}
if(flag==0)
System.out.println("element notfound");
}
}

OUTPUT:

Example 1 — Element Found
Enter number of elements:
5
Enter elements of array:
10
20
30
40
50
Enter element to search:
30
Element found

Example 2 — Element Not Found
Enter number of elements:
5
Enter elements of array:
10
20
30
40
50
Enter element to search:
25
Element not found

RESULT:
Thus, the Java program successfully searches for an element in a sorted array using Binary Search.
