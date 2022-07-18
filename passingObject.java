class First{
    int a=5;
    public void greet(){
        System.out.println("Hello this is first class");
    }
}
class Second{
    int b=5;
}
public class passingObject {
    public static void addTwo(First f,Second s){
    System.out.println("The sum of Two numbers is "+(f.a+s.b));
    f.greet();
    }
    public static void main(String[] args){
    addTwo(new First(){
        @Override
        public void greet() {
            System.out.println("Hello salil I had override it");
        }
    },new Second());
    }
}
