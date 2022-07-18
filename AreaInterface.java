import java.util.Scanner;
import java.math.*;
interface Area{
double AreaOfCircle(float r);
float AreaOfRectangle(float l,float b);
float AreaOfSquare(float side);
}
interface Volume{
    void VolOfSq(double side);
    void VolOfRec(float l,float b,float h);
}
class FindArea implements Area,Volume{
    public double AreaOfCircle(float r){
    double area;
    area=3.14*r*r;
    return area;
    }
    public float AreaOfRectangle(float l,float b){
       float area;
       area=l*b;
       return area;
    }
    public float AreaOfSquare(float side){
     float area;
     area=side*side;
     return area;
    }
    public void VolOfSq(double side){
    double volume;
    volume=Math.pow(side,3);
    System.out.println("The volume of the cube is "+volume);
    }
    public void VolOfRec(float l,float b,float h){
    float volume;
    volume=l*b*h;
    System.out.println("The volume of the cubiod is "+volume);
    
    }

}
public class AreaInterface {
    public static void main(String[] args){
      boolean Exit=false;  
      Scanner sc=new Scanner(System.in);
      FindArea Area=new FindArea();
      while(Exit!=true){
          System.out.println("Press 1. Area of Circle\nPress 2. Area of Square\nPress 3. Area of Reactangle\nPress 4. Volume of cube\nPress 5. Volume of cubiod\nPress 6. Exit");
        int n;
        n=sc.nextInt();
      if(n==1){
      double area;
      float r;
      System.out.println("Enter the radius of the circle");
      r=sc.nextFloat();
      area=Area.AreaOfCircle(r);
      System.out.println("The area of the circle is "+area);
      }
      else if(n==2){
          float side;
          System.out.println("Enter the side of square");
          side=sc.nextFloat();
          float area;
          area=Area.AreaOfSquare(side);
          System.out.println("The area of the square is "+area);
      }
      else if(n==3){
          float area;
          float l,b;
          System.out.println("Enter length and breadth of the rectangle");
          l=sc.nextFloat();
          b=sc.nextFloat();
          area=Area.AreaOfRectangle(l,b);
          System.out.println("The Area of the rectangle is "+area);
      }
      else if(n==4){
      float side;
      System.out.println("Enter the side of the cube");
      side=sc.nextFloat();
      Area.VolOfSq(side);
      }
      else if(n==5){
          float l,b,h;
          System.out.println("Enter the length, breadth and height of the cubiod");
          l=sc.nextFloat();
          b=sc.nextFloat();
          h=sc.nextFloat();
          Area.VolOfRec(l, b, h);
      }
      else if(n==6){
          System.out.println("Byee...");
          Exit=true;
      }
      else{
          System.out.println("Please enter the valid key");
      }
    }

    }
}
