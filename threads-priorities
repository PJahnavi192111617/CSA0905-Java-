import java.util.Scanner;

class Circle extends Thread {
    public void run() {
        int r;
        float a;
        setPriority(Thread.MIN_PRIORITY);
        Scanner s = new Scanner(System.in);
        System.out.println("Area of circle");
        System.out.println("Enter radius: ");
        r = s.nextInt();
        a = (float) 3.14 * (r * r);
        System.out.println("Area of circle: " + a);
    }
}

class Model22 extends Thread {
    public void run() {
        int b, h;
        float x;
        setPriority(Thread.MAX_PRIORITY);
        System.out.println("Area of Triangle");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Base: ");
        b = s.nextInt();
        System.out.println("Enter Height: ");
        h = s.nextInt();
        x = (float) 0.5 * b * h;
        System.out.println("Area of Triangle: " + x);
    }
}

public class Main
 {
    public static void main(String args[]) {
        Circle a = new Circle();
        Model22 k = new Model22();
        a.start();
        k.start();
    }
}
