\*
Aim
To write a Java Applet program to create buttons using the GridLayout manager and arrange 10 buttons in 5 rows and 2 columns.
2. Algorithm
1. Start the program.
2. Import the required AWT and Applet packages.
3. Create a class named gld that extends the Applet class.
4. Override the init() method.
5. Set the layout using GridLayout(5,2).
6. Create 10 buttons with labels A, B, C, D, E, F, G, H, I and J.
7. Add all 10 buttons to the applet.
8. Set the applet margins using the getInsets() method.
9. Display the buttons in 5 rows and 2 columns.
10. Stop the program.

  program:

import java.awt.*;
import java.io.*;
import java.applet.Applet.*;
import java.applet.*;
/*<applet code="gld.class" height=300 width=300>
</applet>*/

public class gld extends Applet
{
public void init()
{
setLayout(new GridLayout(5,2));
Button b1=new Button("A"); Button
b2=new Button("B"); Button b3=new
Button("C"); Button b4=new
Button("D"); Button b5=new
Button("E"); Button b6=new
Button("F"); Button b7=new
Button("G"); Button b8=new
Button("H"); Button b9=new
Button("I"); Button b10=new
Button("J"); add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
add(b10);
}
public Insets getInsets()
{
return new Insets(20,20,20,20);
}}
Output
GridLayout (5 Rows × 2 Columns)
A


B


C


D


E


F


G


H


I


J



Ten buttons arranged in 5 rows and 2 columns.
RESULT:
Thus, the Java Applet program to create 10 buttons using the GridLayout manager in 5 rows and 2 columns was successfully written.
  
