import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter any number");
        num=sc.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(num+" x "+i+" = "+(num*i));
        }
    }
    
}
