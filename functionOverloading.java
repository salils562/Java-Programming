import java.util.Scanner;
public class functionOverloading {
    public static void add(int a,int b){
        System.out.println("The sum of two numbers a and b is "+(a+b));
    }
    public static void add(int a,int b,int c){
        System.out.println("The sum of three numbers a,b and c is "+(a+b+c));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter all the three numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        add(a,b);
        add(a,b,c);
    }
}
