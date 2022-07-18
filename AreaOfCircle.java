import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rad;
        System.out.println("Enter the radius of the circle");
        rad=sc.nextInt();
        float area;
        float PI=3.14f;
        area=PI*rad*rad;
        System.out.println("The area of the circle is "+area);
    }
}
