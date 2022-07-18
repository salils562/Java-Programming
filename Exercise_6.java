package com.codewithharry.shape;
/* 

You have to create a package named com.codewithharry.shape 
This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere 
These classes should use inheritance to properly manage the code!
Include methods like volume, suface are and getter/ setter for dimensions

*/
class Rectangle{
private int l,b,h;
public void setData(int l,int b,int h){
    this.l=l;
    this.b=b;
    this.h=h;
}
public void areaOfRect(){
System.out.println("The area of the rectangle is "+(l*b));
}
public void volOfRect(){
    System.out.println("The volume of the cubiod is "+(l*b*h));
}
public void sufaceAreaRect(){
    System.out.println("The suface area of the rectangle is "+(2*((l*b)+(b*h)+(h*l))));
}
}
class Square extends Rectangle{
    private int side;
    public void setSide(int s){
        side=s;
    }
public void areaOfSq(){
System.out.println("The area of the square is "+(side*side));
}
public void volOfSq(){
    System.out.println("The volume of the square is "+(Math.pow(side,3)));
}
}
class Circle extends Square{
    private double rad;
    public void setRad(double rad){
        this.rad=rad;
    }
    public void areaOfCirc(){
        double area;
        area=3.14*rad*rad;
        System.out.println("The area of the circle is "+area);
    }
    public void circumferenceOfCirc(){
        System.out.println("The circumference of the circle is "+(2*3.14*rad));
    }
}

public class Exercise_6 {
    public static void main(String[] args) {
        
    }
}
