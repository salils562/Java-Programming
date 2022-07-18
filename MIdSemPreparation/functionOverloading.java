import java.util.Scanner;
public class functionOverloading {
    public static int add(int a,int b){
    return (a+b);
    }
    public static int add(int a,int b,int c){
    return a+b+c;
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a,b,c;
    System.out.println("Enter 3 numbers");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    int d=add(a,b);
    int e=add(a,b,c);
    System.out.println("The sum of two numbers is "+d);
    System.out.println("The sum of two numbers is "+e);

    }
}
