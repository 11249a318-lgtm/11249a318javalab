\*
AIM:
To write a Java program to write data into a text file using the FileWriter class.
    
ALGORITHM:
1. Start the program.
2. Import the java.io package.
3. Create a FileWriter object for the file sample2.txt.
4. Use a for loop to generate characters from ASCII value 65 to 90.
5. Write each character into the file using the write() method.
6. Close the file using close().
7. Handle exceptions using the catch block.
8. Stop the program.
    
CODE:
import java.io.*;
class Filewriter {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("sample2.txt");
            for (char i = 65; i < 91; i++) {
                fw.write(i);
            }
            fw.close();
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}

OUTPUT:
The program does not display anything on the console. It creates/writes the following content into sample2.txt:
ABCDEFGHIJKLMNOPQRSTUVWXYZ

RESULT
Thus, the Java program successfully writes the uppercase English alphabets (A–Z) into the file sample2.txt using the FileWriter class.




