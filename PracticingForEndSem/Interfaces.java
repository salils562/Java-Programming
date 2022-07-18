interface keypadPhone{
    public void calling();
    public void cutphone();
}
interface cellPhone extends keypadPhone{
    public void location();
    public void musicPlayer();
}
class SuperPhone implements cellPhone{
    public void greet(){
        System.out.println("Hello bhai ye raha naya cell phone");
    }
    public void calling(){
        System.out.println("PHone is calling");
    }
    public void cutphone(){
        System.out.println("PHone is cutting");
    }
    public void location(){
        System.out.println("PHone is location");
    }
    public void musicPlayer(){
        System.out.println("PHone is musicplayer");
    }
}
public class Interfaces {
    public static void main(String[] args){
     SuperPhone ph=new SuperPhone();
     ph.greet();
    }
}
