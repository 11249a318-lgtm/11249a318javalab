\*
Aim:
To write a Java program to demonstrate multithreading using Thread, yield(), sleep(), and thread termination.

Algorithm:
1.Start the program.
2.Create three thread classes: A, B, and C by extending the Thread class
3.In thread A:
         Print values from 1 to 5.
        Call Thread.yield() when i = 1.
4.In thread B:
          Print values from 1 to 5.
          Terminate the thread when j = 3 using return.
5.In thread C:
          Print values from 1 to 5.
          Pause the thread for 1500 milliseconds when k = 1 using Thread.sleep().
6.Create objects of threads A, B, and C.
7.Start all three threads using start().
8.Print "exit from main thread".
9.Stop.

Code:
class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                Thread.yield();
            }
            System.out.println("from thread A i=" + i);
        }
        System.out.println("exit from A");
    }
}
class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("from thread B j=" + j);

            if (j == 3) {
                System.out.println("exit from B");
                return;
            }
        }
    }
}
class C extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("thread C = " + k);
            if (k == 1) {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.out.println("Thread C interrupted");
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
public class Threadtest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        System.out.println("Start thread A");
        a.start();
        b.start();
        c.start();
        System.out.println("exit from main thread");
    }
}

Output:
The exact order can change each time because the three threads execute concurrently.

Start thread A
from thread B j=1
from thread A i=1
exit from main thread
thread C = 1
from thread B j=2
from thread A i=2
from thread B j=3
exit from B
from thread A i=3
from thread A i=4
from thread A i=5
exit from A
thread C = 2
thread C = 3
thread C = 4
thread C = 5

Result:
Thus, the Java program was successfully executed to demonstrate multithreading, including the use of Thread.yield(), Thread.sleep(), and thread termination using return.







