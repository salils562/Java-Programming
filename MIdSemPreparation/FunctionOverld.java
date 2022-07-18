
// Program to demonstrate function overloading for calculation of average.
import java.util.Scanner;

public class FunctionOverld {
    public static void average(float a, float b) {
        float avg;
        avg = (a + b) / 2;
        System.out.println("The average of two numbers is " + avg);
    }

    public static void average(float a, float b, float c) {
        float avg;
        avg = (a + b + c) / 3;
        System.out.println("The average of three numbers is " + avg);
    }

    public static void average(float a, float b, float c, float d) {
        float avg;
        avg = (a + b + c + d) / 4;
        System.out.println("The average of four numbers is " + avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c, d;
        System.out.println("Enter values of a,b,c and d");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        d = sc.nextFloat();
        average(a,b);
        average(a,b,c);
        average(a,b,c,d);
    }
}
