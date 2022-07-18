class Thread1 implements Runnable{
    public void run(){
        int i=1;
        while(i<100){
            System.out.println("This is 1");
            i++;
        }
    }
}
class Thread2 implements Runnable{
    public void run(){
        int i=0;
        while(i<99){
            System.out.println("This is 2");
            i++;
        }
    }
}
public class ThreadInstance{
    public static void main(String[] args){
        Thread1 bullet=new Thread1();
        Thread gun=new Thread(bullet);
        Thread2 bullet2=new Thread2();
        Thread gun2=new Thread(bullet2);
        gun.start();
        gun2.start();

    }
}