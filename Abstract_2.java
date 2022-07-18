abstract class Cars{
public void show(){
    System.out.println("Hello this is class car");
}
abstract public void greet();
}
class nova extends Cars{
public void showCase(){
    System.out.println("Hello this is class nove");
}
public void greet(){
    System.out.println("Made a concrete class");
}
}
public class Abstract_2{
    public static void main(String[] args){
    nova n = new nova();
    n.show();
    n.showCase();
    n.greet();
    }
}