import java.util.*;

class Model23 {
    int a, b, c, k;

    void getdata(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    void calculate() {
        if (c <= 100) {
            k = c * 1;
        } else if (c >= 101 && c <= 200) {
            k = (int) (c * 2.50);
        } else if (c >= 201 && c <= 500) {
            k = c * 4;
        } else {
            k = c * 6;
        }
    }

    void display()
 {
        System.out.print("Bill: " + k);
    }

    public static void main(String args[]) {
        int a, b, c;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Consumer number: ");
        a = s.nextInt();
        System.out.print("Enter Previous reading: ");
        b = s.nextInt();
        System.out.print("Enter Current reading: ");
        c = s.nextInt();

        Model23 obj = new Model23();
        obj.getdata(a, b, c);
        obj.calculate();
        obj.display();
    }
}
