class Base{
    private int a;
    private int b;
    public Base(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void showData(){
        System.out.println("The values of a and b are "+a+" and "+b);
    }
}
class Child extends Base{
private int c;
private int d;    
public Child(int a,int b,int c,int d){
    super(a,b);
    this.c=c;
    this.d=d;
}
public void showData(){
super.showData();    
System.out.println("The values of c and d are "+c+" and "+d);
}

}
public class ConstructorSuper {
    public static void main(String[] args){
        Child ch=new Child(3,2,4,5);
        ch.showData();
    }
}
