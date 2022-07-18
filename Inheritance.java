class Base{
    public void greet(){
        System.out.println("This is base class 1");
    }
}
class Base2 extends Base{
    public void greet2(){
        System.out.println("This is base class 2");
    }
}
class Base3 extends Base2{
    public void greet3(){
        System.out.println("This is base class 3");
    }
}
public class Inheritance{
    public static void main(String[] args){
      Base3 b=new Base3();
      b.greet();
      b.greet2();
      b.greet3();
    }
}