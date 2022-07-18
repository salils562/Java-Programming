abstract class Company{
    abstract public void greet();
    abstract public void greet2();
}
class Employee extends Company{
    public void greet(){
    System.out.println("Hello this is greet method");
    }
    public void greet2(){
     System.out.println("Hello this is greet method 2");
    }
}
public class AbstractClass {
    public static void main(String[] args){
     Employee e=new Employee();
     e.greet();
     e.greet2();
    }
}
