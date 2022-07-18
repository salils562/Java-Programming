import java.net.SocketTimeoutException;

import javax.sound.sampled.SourceDataLine;

class Th extends Thread{
    String n;
    public Th(String name){
        super(name);
        this.n=name;
    }
    public void run(){
    int i=0;
    while(i<100){
        System.out.println("This is Thread "+n);
        i++;
    }
    }
}
public class ThreadName {
    public static void main(String[] args){
        Th t=new Th("salil");
        Th t2=new Th("mayur");
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println("The name of first thread is "+t.getName());
        System.out.println("The name of second thread is "+t2.getName());
        t.start();
        t2.start();
    }
}
