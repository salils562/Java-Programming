abstract class Telephone{
    abstract public void ring();
    abstract public void lift();
    abstract public void disconnect();
}
interface camera{
    void click();
}
class SmartPhone extends Telephone implements camera{
    public void ring(){
    System.out.println("ringing...");
    }
    public void lift(){
    System.out.println("lifting....");
    }
    public void disconnect(){
        System.out.println("disconnecting...");
    }
    public void smart(){
        System.out.println("SmartPhone");
    }
    public void click(){
        System.out.println("Clicking...");
    }
}
public class Question_3 {
    public static void main(String[] args) {
        Telephone tele=new SmartPhone();
        camera cam=new SmartPhone(); // Here we can only call the methods of camera interface
        tele.ring();
        tele.lift();
        cam.click();
        // tele.smart(); //--> It will not work
    }
}
