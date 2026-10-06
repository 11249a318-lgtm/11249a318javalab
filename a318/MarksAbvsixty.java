\*
Aim
To write a Java program to accept the names and marks of 6 students and display the names and marks of students who scored 60 or above.

Algorithm
1.Start.
2.Declare an integer array marks[6] and a string array name[30].
3.Create a Scanner object to get input from the user.
4.Repeat 6 times:
      Read the student's name.
      Read the student's marks.
      Store them in the respective arrays.
5.Repeat through the 6 students.
6.If marks[i] >= 60, display the student's name and marks.
7.Stop.

Code:
import java.util.Scanner;
public class MarksAbvsixty {
    public static void main(String args[]) {
        int marks[] = new int[6];
        int i;
        String name[] = new String[30];
        Scanner scanner = new Scanner(System.in);
        for (i = 0; i < 6; i++) {
            System.out.print("Enter Name of Student and Marks of Subject " + (i + 1) + ": ");
            name[i] = scanner.next();
            marks[i] = scanner.nextInt();
        }
        for (i = 0; i < 6; i++) {
            if (marks[i] >= 60) {
                System.out.println(name[i] + " " + marks[i]);
            }
        }
    }
}

Output:
Enter Name of Student and Marks of Subject 1: Arun 75
Enter Name of Student and Marks of Subject 2: Priya 45
Enter Name of Student and Marks of Subject 3: Rahul 82
Enter Name of Student and Marks of Subject 4: Meena 58
Enter Name of Student and Marks of Subject 5: Kiran 60
Enter Name of Student and Marks of Subject 6: Divya 91

Arun 75
Rahul 82
Kiran 60
Divya 91

Result:
Thus, the Java program was successfully executed to display the names and marks of students who scored 60 marks or above.







