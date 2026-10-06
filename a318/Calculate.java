\*
AIM:
To write a Java program to calculate the perimeter and area of a square, circle, and triangle using classes and objects.
    
ALGORITHM:
1. Start the program.
2. Create a Scanner object to get input.
3. Read the side of the square and create a Square object.
4. Calculate and display the perimeter and area of the square.
5. Read the radius of the circle and create a Circle object.
6. Calculate and display the perimeter and area of the circle.
7. Read the three sides of the triangle and create a Triangle object.
8. Calculate and display the perimeter and area of the triangle.
9. Close the scanner.
10. Stop the program.
    
code:

import java.util.*;
class Calculate
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Square
        System.out.println("Enter The side of the Square : ");
        int s = sc.nextInt();
        Square sq = new Square(s);
        System.out.println("Perimeter of Square is " + sq.perimeter());
        System.out.println("Area of Square is " + sq.area());
        // Circle
        System.out.println("Enter The radius of the Circle : ");
        int r = sc.nextInt();
        Circle ci = new Circle(r);
        System.out.println("Perimeter of Circle is " + ci.perimeter());
        System.out.println("Area of Circle is " + ci.area());
        // Triangle
        System.out.println("Enter The Side1 of the Triangle : ");
        int s1 = sc.nextInt();
        System.out.println("Enter The Side2 of the Triangle : ");
        int s2 = sc.nextInt();
        System.out.println("Enter The Side3 of the Triangle : ");
        int s3 = sc.nextInt();
        Triangle t = new Triangle(s1, s2, s3);
        System.out.println("Perimeter of Triangle is " + t.perimeter());
        System.out.println("Area of Triangle is " + t.area());
        sc.close();
    }
}
OUTPUT:
Enter The side of the Square :
5
Perimeter of Square is 20
Area of Square is 25
Enter The radius of the Circle :
3
Perimeter of Circle is 18.84955592153876
Area of Circle is 28.274333882308138
Enter The Side1 of the Triangle :
3
Enter The Side2 of the Triangle :
4
Enter The Side3 of the Triangle :
5
Perimeter of Triangle is 12
Area of Triangle is 6.0

RESULT:
Thus, the Java program successfully calculates the perimeter and area of a square, circle, and triangle using classes and objects.
