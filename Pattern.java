import java.util.*;
public class Pattern {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num;
    System.out.println("Enter the number");
    num=sc.nextInt();
    int i=0;
    while(i<num){
        int j=1;
        while(j<=i){
            System.out.print(j);
            j++;
        }
        System.out.println();
        i++;

    }
    }

    
}
