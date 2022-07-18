interface speed{
    void increaseSpeed();
    void decreaseSpeed();
}
interface breaking{
    void applyBreak();
    default void stop(){
        System.out.println("I am using default break");
    }
}
class Bicycle implements speed,breaking{
public void increaseSpeed(){
    System.out.println("Please increase the speed");
}
public void decreaseSpeed(){
    System.out.println("Please slow down");
}
public void applyBreak(){
    System.out.println("Break maar salil sharma");
}
public void showData(){
    System.out.println("This is the new memeber inside the class");
}
}
public class Interfaces_2 {
    public static void main(String[] args) {
        Bicycle avon=new Bicycle();
        avon.applyBreak();
        avon.decreaseSpeed();
        avon.showData();

    }
}
