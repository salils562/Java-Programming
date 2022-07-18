// Write a program to calculate addition of two number using prototyping of methods.
import java.util.Scanner;
public class Prototyping {
    public static float add(float a,float b){
        float c;
        c=a+b;
        return c;
    }
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     float a,b;
     System.out.println("Enter two numbers");
     a=sc.nextFloat();
     b=sc.nextFloat();
     float c;
     c=add(a,b);
     System.out.println("The sum of numbers is "+c);

    }
}
