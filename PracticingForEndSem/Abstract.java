abstract class Car{
    public void startCar(){
        System.out.println("The car is getting started");
    }
    abstract public void speedUp();
}
class Innova extends Car{
    public void speedUp(){
        System.out.println("Speeding up the Car");
    }
}
public class Abstract {
    public static void main(String[] args){
    Innova i1=new Innova();
    i1.startCar();
    i1.speedUp();
    }

}
