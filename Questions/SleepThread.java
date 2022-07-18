class Salil extends Thread{
public void run(){
    int i=1;
    while(i<100){
    System.out.println("Hello this is salil");
    i++;
}
}
}
class Shailja extends Thread{
    public void run(){
        int i=1;
        while(i<100){
        try{
            Thread.sleep(200);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Hello this is shailja");
        i++;
    }
}
}
public class SleepThread {
    public static void main(String[] args){
    Salil sa=new Salil();
    Shailja sc=new Shailja();
    sa.start();
    sc.start();
    }
    
}
