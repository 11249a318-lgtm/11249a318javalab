/
Aim
To write a Java Applet program to draw a human face using Graphics class methods such as drawOval(), fillOval() and fillArc().
2. Algorithm
1. Start the program.
2. Import the AWT and Applet packages.
3. Create a class named face that extends the Applet class.
4. Override the paint(Graphics g) method.
5. Use drawOval() to draw the face, eyes and ears.
6. Use fillOval() to draw the eyeballs and nose.
7. Use fillArc() to draw the mouth.
8. Display the human face.
9. Stop the program.//

  PROGRAM:
  
import java.awt.*; 
import java.io.*; 
import java.applet.*;
/*<applet code="face.class" height=300 width=300>
</applet>*/

public class face extends Applet
{
public void paint(Graphics g)
{
g.drawOval(40,40,120,150);
g.drawOval(57,75,30,20);
g.drawOval(110,75,30,20);
g.fillOval(68,81,10,10);
g.fillOval(121,81,10,10);
g.fillOval(85,100,30,30);
g.fillArc(60,125,80,40,180,180);
g.drawOval(25,92,15,30);
g.drawOval(160,92,15,30);
}
}

