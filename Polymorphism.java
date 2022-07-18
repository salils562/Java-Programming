// polymorphism is very important concept in java
interface paddle{
    void paddleTheBike();
}
interface breakTheBike{
    void breaking();
}
class Cycle implements paddle,breakTheBike{
    public void paddleTheBike(){
      System.out.println("applying paddle...");
    }
    public void breaking(){
        System.out.println("applying break...");
    }
}
public class Polymorphism{
public static void main(String[] args){
breakTheBike v=new Cycle(); // Here i made the reference of interface camera
v.breaking();
}
}