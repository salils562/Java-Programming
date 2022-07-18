class Calculator<f1>{
f1 a;
f1 b;
public void setValue(f1 a,f1 b){
    this.a=a;
    this.b=b;
}
public void addValue(){
    System.out.println("The value of a is "+a);
    System.out.println("The value of b is "+b);
}
}
public class Generics {
    public static void main(String[] args){
     Calculator<Double> c=new Calculator();
     c.setValue(2.4,2.3);
     c.addValue();
    }
}
