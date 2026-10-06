\*
Aim:
To write a Java program to demonstrate the use of an interface by implementing an interface in a class.

Algorithm:
1.Start the program.
2.Create an interface named Animal.
3.Declare two methods animalSound() and sleep() in the interface.
4.Create a class Dog that implements the Animal interface.
5. the animalSound() method to display "The dog says: Bow Bow".
6.Define the sleep() method to display "Zzz".
7.Create an object of the Dog class.
8.Call the animalSound() method.
9.Call the sleep() method.
10.Stop the program.
Note: interface cannot be used as a class name because it is a Java keyword. I changed the class name to InterfaceDemo.
    
code:
interface Animal {
    public void animalSound();
    public void sleep();
}
class Dog implements Animal {
    public void animalSound() {
        System.out.println("The dog says: Bow Bow");
    }
    public void sleep() {
        System.out.println("Zzz");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Dog a = new Dog();
        a.animalSound();
        a.sleep();
    }
}

Output:
The dog says: Bow Bow
Zzz

Result:
Thus, the Java program was successfully executed to demonstrate the implementation of an interface using the implements keyword.


