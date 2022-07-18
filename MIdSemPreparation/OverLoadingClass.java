import java.util.*;
class Calculator{
    int a,b,c;
    public Calculator(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void add(int a,int b){
    System.out.println("The sum of two numbers is "+(a+b));
    }
    public void add(int a,int b,int c){
    System.out.println("The sum of three numbers is "+(a+b+c));
    }
}
public class OverLoadingClass {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a,b,c;
    System.out.println("Enter 3 numbers ");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    Calculator cs=new Calculator(a, b, c);
    cs.add(a,b);
    cs.add(a,b,c);
    }
}
