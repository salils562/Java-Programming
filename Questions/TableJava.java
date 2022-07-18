import java.util.Scanner;
public class TableJava{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num;
    System.out.println("Enter any number");
    num=sc.nextInt();
    int fact;
    for(int i=1;i<11;i++){
        fact=num*i;
        System.out.println(num+" x "+i+" = "+fact);
    }
    }
}