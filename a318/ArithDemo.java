\*
AIM:
To write a Java program using packages to perform arithmetic operations such as addition, subtraction, multiplication, and division.
  
ALGORITHM:
1. Start the program.
2. Import the add, sub, mul, and div packages.
3. Create objects for Add, Sub, Mul, and Div classes.
4. Call the addition operation using addop(20,10).
5. Call the subtraction operation using subop(20,10).
6. Call the multiplication operation using mulop(20,10).
7. Call the division operation using divop(20,10).
8. Display the results.
9. Stop the program.
  
CODE:
import java.util.*;
import add.*;
import sub.*;
import mul.*;
import div.*;

public class ArithDemo
{
    public static void main(String args[])
    {
        Add ad = new Add();
        Sub su = new Sub();
        Mul mu = new Mul();
        Div di = new Div();
        ad.addop(20, 10);
        su.subop(20, 10);
        mu.mulop(20, 10);
        di.divop(20, 10);
    }
}

OUTPUT:
Addition: 30
Subtraction: 10
Multiplication: 200
Division: 2

RESULT:
Thus, the Java program successfully performs arithmetic operations using packages.



