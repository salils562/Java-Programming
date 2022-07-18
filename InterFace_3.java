class Cellphone{
    public void pickCall(){
        System.out.println("Picking up the call....");
    }
    public void endCall(){
        System.out.println("Ending up the call...");
    }
}
interface Gps{
    void showLocation();
    void trackLocation();
}
interface Camera{
    void clickPhoto();
    void recordVideo();
}
class SmartPhone extends Cellphone implements Gps,Camera{
    public void showLocation(){
    System.out.println("Showing your location...");
    }
    public void trackLocation(){
     System.out.println("Tracking your location...");
    }
    public void clickPhoto(){
     System.out.println("Clicking your phone");
    }
    public void recordVideo(){
     System.out.println("Recoring your video");
    }
}
public class InterFace_3 {
    public static void main(String[] args){
        SmartPhone redmi=new SmartPhone();
        redmi.pickCall();
        redmi.endCall();
        redmi.clickPhoto();
        redmi.recordVideo();
        redmi.showLocation();
        redmi.trackLocation();
        
    }
}
