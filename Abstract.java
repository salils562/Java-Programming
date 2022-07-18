import java.util.Scanner;
abstract class Areas{
abstract public void Area(int l,int b);
abstract public void volume(int l,int b,int h);
abstract public void perimeter(int l,int b);
}

class AreaOfSquare extends Areas{
private float area;    
private float vol;
private float peri;
@Override   
public void Area(int len,int breadth){
area=len*breadth;
System.out.println("The area of square is "+area);
}
@Override
public void volume(int l,int b,int h){
vol=l*b*h;
System.out.println("The volume of the cube is "+vol);
}
@Override
public void perimeter(int l,int b){
peri=2*(l+b);
System.out.println("The perimeter of the square is "+peri);
}
}
class AreaOfRectangle extends Areas{
    private float area;    
    private float vol;
    private float peri;
    @Override   
    public void Area(int len,int breadth){
        area=len*breadth;
        System.out.println("The area of rectangle is "+area);
    }
    @Override
    public void volume(int l,int b,int h){
    vol=l*b*h;
    System.out.println("The volume of the cuboid is "+vol);
    }
    @Override
    public void perimeter(int l,int b){
    peri=2*(l+b);
    System.out.println("The perimeter of the rectangle is "+peri);
    }
}
public class Abstract{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    AreaOfSquare sq=new AreaOfSquare();
    AreaOfRectangle rc=new AreaOfRectangle();
    int side;
    System.out.println("Enter the side of the square");
    side=sc.nextInt();
    int l=side;
    int b=side;
    int h=side;
    sq.Area(l,b);
    sq.volume(l, b, h);
    sq.perimeter(l, b);
    int len,bre,hei;
    System.out.println("Enter length, breadth and height of rectangle");
    len=sc.nextInt();
    bre=sc.nextInt();
    hei=sc.nextInt();
    rc.Area(len, bre);
    rc.perimeter(len, bre);
    rc.volume(len, bre, hei);
}


}