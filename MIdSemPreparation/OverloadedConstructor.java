// Program to demonstrating overloaded constructor for calculating box volume.
import java.util.Scanner;
class Box{
    private float length,breadth,height;
    private float volume;
    Box(float s1,float s2,float s3){
    length=s1;
    breadth=s2;
    height=s3;
    }
    public void calculateVol(){
        volume=length*breadth*height;
    }
    public void showVolume(){
        System.out.println("The volume of the box is "+volume);
    }
}
public class OverloadedConstructor {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    float len,bre,hei;
    System.out.println("Enter lenght , breadth and height of the box");
    len=sc.nextFloat();
    bre=sc.nextFloat();
    hei=sc.nextFloat();
    Box b=new Box(len, bre, hei);
    b.calculateVol();
    b.showVolume();
    }
}
