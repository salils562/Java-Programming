abstract class pen{
abstract public void write();    
abstract public void refill();    
}
class FountainPen extends pen{
    public void write(){
        System.out.println("Writing...");

    }
    public void refill(){
        System.out.println("Refilling...");
    }
    public void changeNib(){
        System.out.println("Changing nib...");
    }

}
public class Question_1{
    public static void main(String[] args){
    FountainPen f=new FountainPen();
    f.changeNib();
    f.refill();
    f.write();
    }

}