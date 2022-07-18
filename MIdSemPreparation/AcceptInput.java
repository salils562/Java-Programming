import java.util.Scanner;
public class AcceptInput{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int a,b;
     System.out.println("Enter two numbers");
     a=sc.nextInt();
     b=sc.nextInt();
     System.out.println("The sum of two numbers is "+(a+b));
    }
}