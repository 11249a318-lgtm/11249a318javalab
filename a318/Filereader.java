\*
AIM:
To write a Java program to read and display the contents of a text file using the FileReader class.
    
ALGORITHM:
1. Start the program.
2. Import the java.io package.
3. Create a FileReader object and open the file sample2.txt.
4. Read the file character by character using the read() method.
5. Continue reading until read() returns -1.
6. Convert each integer value into a character and display it.
7. Close the file using close().
8. Handle any exception using the catch block.
9. Stop the program.
    
CODE:
import java.io.*;
class Filereader {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("sample2.txt");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.println((char) i);
            }
            fr.close();
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}

SAMPLE FILE — sample2.txt
Hello Java
This is a FileReader program.

OUTPUT
H
e
l
l
o
 
J
a
v
a

T
h
i
s
 
i
s
 
a
 
F
i
l
e
R
e
a
d
e
r
 
p
r
o
g
r
a
m
.

RESULT:
Thus, the Java program successfully reads and displays the contents of a text file using the FileReader class.



