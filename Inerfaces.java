/* Interfaces provide multiple inheritance
They are used to define some methods that are
defined inside the class.
We can create multiple interfaces and use them in
single class because interfaces provide multiple inheritance
*/
interface Camera{
    void clickSnap();
    void recordVideo();
}

interface Gps{
    int a=3;
    void trackLocation();
    default void showLoaction(){
        System.out.println("Showing your live location");
    }
}
interface functionality extends Gps,Camera{
void greet();
}
class SmartPhone implements functionality{
    public void clickSnap(){
        System.out.println("Taking picture");
    }
    public void recordVideo(){
        System.out.println("Recording video...");
    }
    public void trackLocation(){
        System.out.println("Tracking location..");
    }
    public void greet(){
        System.out.println("Grettings from Asper");
    }
}
public class Inerfaces {
    public static void main(String[] args){
    SmartPhone samsung=new SmartPhone();
    samsung.clickSnap();
    samsung.greet();
    samsung.recordVideo();
    samsung.showLoaction();
    }
    
}
